package starlib.formula.expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import starlib.formula.Variable;

public class Expression {
	
	public List<Variable> getVars() {
		return new ArrayList<Variable>();
	}
	
	public Expression substitute(Variable[] fromVars, Variable[] toVars,
			Map<String,String> existVarSubMap) {
		return null;
	}
	
	public void updateType(List<Variable> knownTypeVars) {
		return;
	}

}
