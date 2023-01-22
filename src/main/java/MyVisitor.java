import antlr.hussarBaseVisitor;
import antlr.hussarParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyVisitor extends hussarBaseVisitor<Object> {
    private final BufferedWriter writer;


    public MyVisitor(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
        writer.append("public class Output{");
    }

    public void closeFile() throws IOException {
        writer.append("}");
        writer.close();
//        writer.flush();
    }

    @Override
    public Object visitProgram_sym(hussarParser.Program_symContext ctx) {
        try {
            writer.append("public static void main(String[] args");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
//        System.out.print("public static void main(");
        return visitChildren(ctx);
    }

    @Override
    public Object visitStart_block(hussarParser.Start_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnd_block(hussarParser.End_blockContext ctx) {
        try {
            writer.append("}");
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitHussar_expr(hussarParser.Hussar_exprContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Object visitVar_decl(hussarParser.Var_declContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitInt_decl(hussarParser.Int_declContext ctx) {
        try {
            writer.append("int " + ctx.ID_NAME());
            if (ctx.EQ() != null) {
                writer.append(ctx.EQ()+"");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitChar_decl(hussarParser.Char_declContext ctx) {
        try {
            writer.append("String " + ctx.ID_NAME() + "=" + ctx.CHAR() + ";");
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitString_decl(hussarParser.String_declContext ctx) {
        try {
            writer.append("String " + ctx.ID_NAME() + "=" + ctx.STRING() + ";");
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitVar_redecl(hussarParser.Var_redeclContext ctx) {
        try {
            writer.append(ctx.ID_NAME() + "=");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitInt_redecl(hussarParser.Int_redeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitChar_redecl(hussarParser.Char_redeclContext ctx) {
        try {
            writer.append(ctx.CHAR()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitString_redecl(hussarParser.String_redeclContext ctx) {
        try {
            writer.append(ctx.STRING()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitMath_symbol_prio0(hussarParser.Math_symbol_prio0Context ctx) {
        try {
            writer.append((ctx.PLUS() != null ? ctx.PLUS() : ctx.MINUS() != null ? ctx.MINUS() : "%")+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitMath_symbol_prio1(hussarParser.Math_symbol_prio1Context ctx) {
        try {
            writer.append((ctx.DIVIDE() != null ? ctx.DIVIDE() : ctx.MULTIPLICATION())+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitMath_symbol_prio2(hussarParser.Math_symbol_prio2Context ctx) {
        try {
            writer.append(",");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitStart_bracket(hussarParser.Start_bracketContext ctx) {
        try {
            writer.append(ctx.L_BRACKET()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnd_bracket(hussarParser.End_bracketContext ctx) {
        try {
            writer.append(ctx.R_BRACKET()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitStart_bracket_fake_power(hussarParser.Start_bracket_fake_powerContext ctx) {
        try {
            writer.append("(int) Math.pow(");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnd_bracket_fake(hussarParser.End_bracket_fakeContext ctx) {
        try {
            writer.append(")");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnd_semicolon(hussarParser.End_semicolonContext ctx) {
        try {
            writer.append(";");
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitBase(hussarParser.BaseContext ctx) {
        try {
            if (ctx.INT() != null) {
                writer.append(ctx.INT()+"");
            } else if (ctx.ID_NAME() != null) {
                writer.append(ctx.ID_NAME()+"");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitFactor(hussarParser.FactorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitComponent(hussarParser.ComponentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMath_expr(hussarParser.Math_exprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSupreme_math_expr(hussarParser.Supreme_math_exprContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Object visitLoop_expr(hussarParser.Loop_exprContext ctx) {
        try {
            if (ctx.start_block().IF_SYM() != null) {
                writer.append("if(");
            } else if (ctx.start_block().FOR_SYM() != null) {
                writer.append("for(");
            } else if (ctx.start_block().WHILE_SYM() != null) {
                writer.append("while(");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitThen_sym(hussarParser.Then_symContext ctx) {
        try {
            writer.append("){");
            writer.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitIs_equal(hussarParser.Is_equalContext ctx) {
        try {
            writer.append("==");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitCompare_sym(hussarParser.Compare_symContext ctx) {
        try {
            if (ctx.NOTEQ() != null) {
                writer.append("!=");
            } else if (ctx.LESSER() != null) {
                writer.append(ctx.LESSER()+"");
            } else if (ctx.LESSEREQ() != null) {
                writer.append(ctx.LESSEREQ()+"");
            } else if (ctx.GREATER() != null) {
                writer.append(ctx.GREATER()+"");
            } else if (ctx.GREATEREQ() != null) {
                writer.append(ctx.GREATEREQ()+"");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondition(hussarParser.ConditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitFor_range(hussarParser.For_rangeContext ctx) {
        try {
            writer.append("int tempUntypicalVariable=" + ctx.INT().get(0) +
                    "; tempUntypicalVariable <= " + ctx.INT().get(1) + "; tempUntypicalVariable++");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_separator(hussarParser.Print_separatorContext ctx) {
        try {
            writer.append("+ \" \" +");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitPrint_string(hussarParser.Print_stringContext ctx) {
        try {
            writer.append(ctx.STRING()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_char(hussarParser.Print_charContext ctx) {
        try {
            writer.append(ctx.CHAR()+"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint_newline(hussarParser.Print_newlineContext ctx) {
        try {
            writer.append("\"\\n\"");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrint(hussarParser.PrintContext ctx) {
        try {
            writer.append("System.out.print(");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return visitChildren(ctx);
    }
}
