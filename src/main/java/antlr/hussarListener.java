// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hussarParser}.
 */
public interface hussarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hussarParser#program_sym}.
	 * @param ctx the parse tree
	 */
	void enterProgram_sym(hussarParser.Program_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#program_sym}.
	 * @param ctx the parse tree
	 */
	void exitProgram_sym(hussarParser.Program_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#start_block}.
	 * @param ctx the parse tree
	 */
	void enterStart_block(hussarParser.Start_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#start_block}.
	 * @param ctx the parse tree
	 */
	void exitStart_block(hussarParser.Start_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#end_block}.
	 * @param ctx the parse tree
	 */
	void enterEnd_block(hussarParser.End_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#end_block}.
	 * @param ctx the parse tree
	 */
	void exitEnd_block(hussarParser.End_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#hussar_expr}.
	 * @param ctx the parse tree
	 */
	void enterHussar_expr(hussarParser.Hussar_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#hussar_expr}.
	 * @param ctx the parse tree
	 */
	void exitHussar_expr(hussarParser.Hussar_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(hussarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(hussarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#int_decl}.
	 * @param ctx the parse tree
	 */
	void enterInt_decl(hussarParser.Int_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#int_decl}.
	 * @param ctx the parse tree
	 */
	void exitInt_decl(hussarParser.Int_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#char_decl}.
	 * @param ctx the parse tree
	 */
	void enterChar_decl(hussarParser.Char_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#char_decl}.
	 * @param ctx the parse tree
	 */
	void exitChar_decl(hussarParser.Char_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(hussarParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(hussarParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#math_symbol}.
	 * @param ctx the parse tree
	 */
	void enterMath_symbol(hussarParser.Math_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#math_symbol}.
	 * @param ctx the parse tree
	 */
	void exitMath_symbol(hussarParser.Math_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(hussarParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(hussarParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expr(hussarParser.Loop_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#loop_expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expr(hussarParser.Loop_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#then_sym}.
	 * @param ctx the parse tree
	 */
	void enterThen_sym(hussarParser.Then_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#then_sym}.
	 * @param ctx the parse tree
	 */
	void exitThen_sym(hussarParser.Then_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#compare_sym}.
	 * @param ctx the parse tree
	 */
	void enterCompare_sym(hussarParser.Compare_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#compare_sym}.
	 * @param ctx the parse tree
	 */
	void exitCompare_sym(hussarParser.Compare_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(hussarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(hussarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#for_range}.
	 * @param ctx the parse tree
	 */
	void enterFor_range(hussarParser.For_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#for_range}.
	 * @param ctx the parse tree
	 */
	void exitFor_range(hussarParser.For_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(hussarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(hussarParser.PrintContext ctx);
}