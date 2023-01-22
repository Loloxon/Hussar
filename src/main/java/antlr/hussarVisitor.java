// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hussarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hussarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hussarParser#program_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_sym(hussarParser.Program_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#start_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_block(hussarParser.Start_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_block(hussarParser.End_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#hussar_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHussar_expr(hussarParser.Hussar_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(hussarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#int_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_decl(hussarParser.Int_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#char_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_decl(hussarParser.Char_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#string_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_decl(hussarParser.String_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#var_redecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_redecl(hussarParser.Var_redeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#int_redecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_redecl(hussarParser.Int_redeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#char_redecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_redecl(hussarParser.Char_redeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#string_redecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_redecl(hussarParser.String_redeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_symbol_prio0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_symbol_prio0(hussarParser.Math_symbol_prio0Context ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_symbol_prio1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_symbol_prio1(hussarParser.Math_symbol_prio1Context ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_symbol_prio2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_symbol_prio2(hussarParser.Math_symbol_prio2Context ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#start_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_bracket(hussarParser.Start_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#end_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_bracket(hussarParser.End_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#start_bracket_fake_power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_bracket_fake_power(hussarParser.Start_bracket_fake_powerContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#end_bracket_fake}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_bracket_fake(hussarParser.End_bracket_fakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#end_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_semicolon(hussarParser.End_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase(hussarParser.BaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(hussarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(hussarParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath_expr(hussarParser.Math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#supreme_math_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupreme_math_expr(hussarParser.Supreme_math_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#loop_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_expr(hussarParser.Loop_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#then_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_sym(hussarParser.Then_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#is_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs_equal(hussarParser.Is_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#compare_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare_sym(hussarParser.Compare_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(hussarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#for_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range(hussarParser.For_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_separator(hussarParser.Print_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_string(hussarParser.Print_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_char(hussarParser.Print_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_newline(hussarParser.Print_newlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link hussarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(hussarParser.PrintContext ctx);
}