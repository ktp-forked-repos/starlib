// Generated from InductivePred.g4 by ANTLR 4.7

package starlib.predicate;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InductivePredParser}.
 */
public interface InductivePredListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#preds}.
	 * @param ctx the parse tree
	 */
	void enterPreds(InductivePredParser.PredsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#preds}.
	 * @param ctx the parse tree
	 */
	void exitPreds(InductivePredParser.PredsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#tail}.
	 * @param ctx the parse tree
	 */
	void enterTail(InductivePredParser.TailContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#tail}.
	 * @param ctx the parse tree
	 */
	void exitTail(InductivePredParser.TailContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#pred}.
	 * @param ctx the parse tree
	 */
	void enterPred(InductivePredParser.PredContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#pred}.
	 * @param ctx the parse tree
	 */
	void exitPred(InductivePredParser.PredContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(InductivePredParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(InductivePredParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(InductivePredParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(InductivePredParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#formulas}.
	 * @param ctx the parse tree
	 */
	void enterFormulas(InductivePredParser.FormulasContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#formulas}.
	 * @param ctx the parse tree
	 */
	void exitFormulas(InductivePredParser.FormulasContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(InductivePredParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(InductivePredParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#heapTerms}.
	 * @param ctx the parse tree
	 */
	void enterHeapTerms(InductivePredParser.HeapTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#heapTerms}.
	 * @param ctx the parse tree
	 */
	void exitHeapTerms(InductivePredParser.HeapTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#heapTerm}.
	 * @param ctx the parse tree
	 */
	void enterHeapTerm(InductivePredParser.HeapTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#heapTerm}.
	 * @param ctx the parse tree
	 */
	void exitHeapTerm(InductivePredParser.HeapTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#pointToTerm}.
	 * @param ctx the parse tree
	 */
	void enterPointToTerm(InductivePredParser.PointToTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#pointToTerm}.
	 * @param ctx the parse tree
	 */
	void exitPointToTerm(InductivePredParser.PointToTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#inductiveTerm}.
	 * @param ctx the parse tree
	 */
	void enterInductiveTerm(InductivePredParser.InductiveTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#inductiveTerm}.
	 * @param ctx the parse tree
	 */
	void exitInductiveTerm(InductivePredParser.InductiveTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#pureTerms}.
	 * @param ctx the parse tree
	 */
	void enterPureTerms(InductivePredParser.PureTermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#pureTerms}.
	 * @param ctx the parse tree
	 */
	void exitPureTerms(InductivePredParser.PureTermsContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#pureTerm}.
	 * @param ctx the parse tree
	 */
	void enterPureTerm(InductivePredParser.PureTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#pureTerm}.
	 * @param ctx the parse tree
	 */
	void exitPureTerm(InductivePredParser.PureTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#eqNullTerm}.
	 * @param ctx the parse tree
	 */
	void enterEqNullTerm(InductivePredParser.EqNullTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#eqNullTerm}.
	 * @param ctx the parse tree
	 */
	void exitEqNullTerm(InductivePredParser.EqNullTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#neNullTerm}.
	 * @param ctx the parse tree
	 */
	void enterNeNullTerm(InductivePredParser.NeNullTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#neNullTerm}.
	 * @param ctx the parse tree
	 */
	void exitNeNullTerm(InductivePredParser.NeNullTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#eqTerm}.
	 * @param ctx the parse tree
	 */
	void enterEqTerm(InductivePredParser.EqTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#eqTerm}.
	 * @param ctx the parse tree
	 */
	void exitEqTerm(InductivePredParser.EqTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#neTerm}.
	 * @param ctx the parse tree
	 */
	void enterNeTerm(InductivePredParser.NeTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#neTerm}.
	 * @param ctx the parse tree
	 */
	void exitNeTerm(InductivePredParser.NeTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#comparisonTerm}.
	 * @param ctx the parse tree
	 */
	void enterComparisonTerm(InductivePredParser.ComparisonTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#comparisonTerm}.
	 * @param ctx the parse tree
	 */
	void exitComparisonTerm(InductivePredParser.ComparisonTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(InductivePredParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(InductivePredParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(InductivePredParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(InductivePredParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link InductivePredParser#ter}.
	 * @param ctx the parse tree
	 */
	void enterTer(InductivePredParser.TerContext ctx);
	/**
	 * Exit a parse tree produced by {@link InductivePredParser#ter}.
	 * @param ctx the parse tree
	 */
	void exitTer(InductivePredParser.TerContext ctx);
}