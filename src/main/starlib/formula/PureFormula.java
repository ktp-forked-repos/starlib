package starlib.formula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import starlib.StarVisitor;
import starlib.formula.pure.EqNullTerm;
import starlib.formula.pure.EqTerm;
import starlib.formula.pure.NEqNullTerm;
import starlib.formula.pure.NEqTerm;
import starlib.formula.pure.PureTerm;

// a pure formula includes multiple pure terms

public class PureFormula {
	
	// contains array of pure terms, empty means true
	private PureTerm[] pureTerms;
	
	private List<List<Variable>> alias;
	
	public PureFormula(PureTerm... pureTerms) {
		this.pureTerms = pureTerms;
		this.alias = new ArrayList<List<Variable>>();
		
		for (PureTerm term : pureTerms) {
			if (term instanceof EqTerm) {
				updateAlias((EqTerm) term);
			}
		}
	}
	
	public PureTerm[] getPureTerms() {
		return pureTerms;
	}
	
	public List<List<Variable>> getAlias() {
		return alias;
	}
	
	private void updateAlias(EqTerm term) {
		Variable var1 = term.getVar1();
		Variable var2 = term.getVar2();

		boolean done = false;

		for (List<Variable> vars : alias) {
			if (vars.contains(var1) && vars.contains(var2)) {
				done = true;
				break;
			} else if (vars.contains(var1) && !vars.contains(var2)) {
				done = true;
				vars.add(var2);
				break;
			} else if (!vars.contains(var1) && vars.contains(var2)) {
				done = true;
				vars.add(var1);
				break;
			}
		}

		if (!done) {
			List<Variable> vars = new ArrayList<Variable>();
			vars.add(var1);
			vars.add(var2);
			alias.add(vars);
		}
	}
	
	public PureFormula substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		int length = pureTerms.length;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			newPureTerms[i] = pureTerms[i].substitute(fromVars, toVars, existVarSubMap);
		}
		
		PureFormula newPureFormula = new PureFormula(newPureTerms);
		
		return newPureFormula;
	}
	
	public PureFormula copy() {
		int length = pureTerms.length;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length; i++) {
			newPureTerms[i] = pureTerms[i].copy();
		}
		
		PureFormula newPureFormula = new PureFormula(newPureTerms);
		return newPureFormula;
	}
	
	public void addTerm(PureTerm term) {
		int length = pureTerms.length + 1;
		PureTerm[] newPureTerms = new PureTerm[length];
		
		for (int i = 0; i < length - 1; i++) {
			newPureTerms[i] = pureTerms[i];
		}
		
		newPureTerms[length - 1] = term;
		pureTerms = newPureTerms;
		
		if (term instanceof EqTerm) {
			updateAlias((EqTerm) term);
		}
	}
	
	public void updateType(HashMap<String,String> knownTypeVars) {
		int oldLength = knownTypeVars.size();
		
		while (true) {
			int length = pureTerms.length;
			
			for (int i = 0; i < length; i++) {
				pureTerms[i].updateType(knownTypeVars);
			}
			
			int newLength = knownTypeVars.size();
			
			if (newLength == oldLength) break;
			else oldLength = newLength;
		}
	}
	
	// remove all primitive terms because we have sat assignment later
	// we also remove terms without type
	public void removeTerm() {
		List<PureTerm> tmp = new ArrayList<PureTerm>();
		
		for (PureTerm pt : pureTerms) {
			if (pt instanceof EqNullTerm) { 
				Variable var = ((EqNullTerm) pt).getVar();
				if (var.hasType()) tmp.add(pt);
			} else if (pt instanceof NEqNullTerm) {
				Variable var = ((NEqNullTerm) pt).getVar();
				if (var.hasType()) tmp.add(pt);
			} else if (pt instanceof EqTerm) {
				Variable var1 = ((EqTerm) pt).getVar1();
				if (var1.hasType() && !var1.isPrim()) tmp.add(pt);
			} else if (pt instanceof NEqTerm) {
				Variable var1 = ((NEqTerm) pt).getVar1();
				if (var1.hasType() && !var1.isPrim()) tmp.add(pt);
			}
		}
		
		int length = tmp.size();
		PureTerm[] newPureTerms = new PureTerm[length];
		tmp.toArray(newPureTerms);
		
		pureTerms = newPureTerms;
	}
	
	public void accept(StarVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public String toString() {
		if (pureTerms.length == 0)
			return "true";
		else {
			int length = pureTerms.length;
			StringBuilder ret = new StringBuilder();
			
			for (int i = 0; i < length - 1; i++) {
				ret.append(pureTerms[i] + " & ");
			}
			
			ret.append(pureTerms[length - 1]);
			
			return ret.toString();
		}
	}
	
	public String toS2SATString() {
		return this.toString();
	}
}
