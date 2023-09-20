package expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import antlr.ExprBaseVisitor;
import antlr.ExprParser.ProgramContext;

public class AntlrToProgram extends ExprBaseVisitor<Program>{
	public List<String> semanticErrors;
	public List<String> files,path;
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog=new Program();
		semanticErrors=new ArrayList<String>();
		files= new ArrayList<String>();
		path = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors,files,path,x);
		for(int i=0;i<ctx.getChildCount();i++) {
			if (i==ctx.getChildCount()-1) {
			}
			else {
				prog.addExpression(exprVisitor.visit(ctx.getChild(i)));
			}
		}
			
		return prog;
		
	}
	

}
