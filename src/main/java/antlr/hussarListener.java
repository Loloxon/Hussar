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
	 * Enter a parse tree produced by {@link hussarParser#var_redecl}.
	 * @param ctx the parse tree
	 */
	void enterVar_redecl(hussarParser.Var_redeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#var_redecl}.
	 * @param ctx the parse tree
	 */
	void exitVar_redecl(hussarParser.Var_redeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#int_redecl}.
	 * @param ctx the parse tree
	 */
	void enterInt_redecl(hussarParser.Int_redeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#int_redecl}.
	 * @param ctx the parse tree
	 */
	void exitInt_redecl(hussarParser.Int_redeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#char_redecl}.
	 * @param ctx the parse tree
	 */
	void enterChar_redecl(hussarParser.Char_redeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#char_redecl}.
	 * @param ctx the parse tree
	 */
	void exitChar_redecl(hussarParser.Char_redeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#string_redecl}.
	 * @param ctx the parse tree
	 */
	void enterString_redecl(hussarParser.String_redeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#string_redecl}.
	 * @param ctx the parse tree
	 */
	void exitString_redecl(hussarParser.String_redeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#math_symbol_prio0}.
	 * @param ctx the parse tree
	 */
	void enterMath_symbol_prio0(hussarParser.Math_symbol_prio0Context ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#math_symbol_prio0}.
	 * @param ctx the parse tree
	 */
	void exitMath_symbol_prio0(hussarParser.Math_symbol_prio0Context ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#math_symbol_prio1}.
	 * @param ctx the parse tree
	 */
	void enterMath_symbol_prio1(hussarParser.Math_symbol_prio1Context ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#math_symbol_prio1}.
	 * @param ctx the parse tree
	 */
	void exitMath_symbol_prio1(hussarParser.Math_symbol_prio1Context ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#math_symbol_prio2}.
	 * @param ctx the parse tree
	 */
	void enterMath_symbol_prio2(hussarParser.Math_symbol_prio2Context ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#math_symbol_prio2}.
	 * @param ctx the parse tree
	 */
	void exitMath_symbol_prio2(hussarParser.Math_symbol_prio2Context ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#start_bracket}.
	 * @param ctx the parse tree
	 */
	void enterStart_bracket(hussarParser.Start_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#start_bracket}.
	 * @param ctx the parse tree
	 */
	void exitStart_bracket(hussarParser.Start_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#end_bracket}.
	 * @param ctx the parse tree
	 */
	void enterEnd_bracket(hussarParser.End_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#end_bracket}.
	 * @param ctx the parse tree
	 */
	void exitEnd_bracket(hussarParser.End_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#start_bracket_fake_power}.
	 * @param ctx the parse tree
	 */
	void enterStart_bracket_fake_power(hussarParser.Start_bracket_fake_powerContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#start_bracket_fake_power}.
	 * @param ctx the parse tree
	 */
	void exitStart_bracket_fake_power(hussarParser.Start_bracket_fake_powerContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#end_bracket_fake}.
	 * @param ctx the parse tree
	 */
	void enterEnd_bracket_fake(hussarParser.End_bracket_fakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#end_bracket_fake}.
	 * @param ctx the parse tree
	 */
	void exitEnd_bracket_fake(hussarParser.End_bracket_fakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#end_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterEnd_semicolon(hussarParser.End_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#end_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitEnd_semicolon(hussarParser.End_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(hussarParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(hussarParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(hussarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(hussarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link hussarParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(hussarParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(hussarParser.ComponentContext ctx);
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
	 * Enter a parse tree produced by {@link hussarParser#supreme_math_expr}.
	 * @param ctx the parse tree
	 */
	void enterSupreme_math_expr(hussarParser.Supreme_math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#supreme_math_expr}.
	 * @param ctx the parse tree
	 */
	void exitSupreme_math_expr(hussarParser.Supreme_math_exprContext ctx);
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
	 * Enter a parse tree produced by {@link hussarParser#is_equal}.
	 * @param ctx the parse tree
	 */
	void enterIs_equal(hussarParser.Is_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hussarParser#is_equal}.
	 * @param ctx the parse tree
	 */
	void exitIs_equal(hussarParser.Is_equalContext ctx);
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