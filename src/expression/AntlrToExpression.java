package expression;

import org.antlr.v4.runtime.Token;


import antlr.ExprBaseVisitor;
import antlr.ExprParser.AsopContext;
import antlr.ExprParser.AssignExpContext;
import antlr.ExprParser.BinopAndExpContext;
import antlr.ExprParser.BinopCompExpContext;
import antlr.ExprParser.BinopEqNeqExpContext;
import antlr.ExprParser.BinopMulDiVModExpContext;
import antlr.ExprParser.BinopOrExpContext;
import antlr.ExprParser.BinopPlusMinExpContext;
import antlr.ExprParser.BlockContext;
import antlr.ExprParser.BreakCommandContext;
import antlr.ExprParser.ContCommandContext;
import antlr.ExprParser.DeclContext;
import antlr.ExprParser.DeclsContext;
import antlr.ExprParser.ElseblckContext;
import antlr.ExprParser.ForStatementContext;
import antlr.ExprParser.IfStatementContext;
import antlr.ExprParser.NumContext;
import antlr.ExprParser.PexpContext;
import antlr.ExprParser.PrintExpContext;
import antlr.ExprParser.StmtContext;
import antlr.ExprParser.StmtsContext;
import antlr.ExprParser.TypeContext;
import antlr.ExprParser.UnopNotExpContext;
import antlr.ExprParser.UnopRSExpContext;
import antlr.ExprParser.VariableContext;
import antlr.ExprParser.VarsContext;
import antlr.ExprParser.WhileStatementContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AntlrToExpression extends ExprBaseVisitor<Expression>{

	private Map<String,VariableDecleration> vars; //Stores all the variables declared in the program so far
	private List<String> semanticErrors; //1. Duplicate deceleration. 2. Undeclared variable
	private Type currentType;
	private List<String> file;
	private List<String> Path;
	private int varMem=2000;
	private int index=3500;
	private int codeGen=0;
	private int Start=1;
	
	
	
	public AntlrToExpression(List<String> sE,List<String> s,List<String> sP,int cg) {
		vars=new HashMap<>();
		this.semanticErrors=sE;
		this.file=s;
		this.Path=sP;
		this.codeGen=cg;
	}
	@Override
	public Expression visitDecls(DeclsContext ctx) {
		Path.add("VisitDecls");
		if (ctx.getChildCount()==0) {
			file.add("SIGN\t\tCON\t\t0\n");
			file.add("HALF1\t\tCON\t\t0\n");
			file.add("HALF2\t\tCON\t\t0\n");

			return null;
		}
		else {
			Declerations vd=new Declerations();
			Expression e0=visit(ctx.getChild(0));
			Expression e1=visit(ctx.getChild(1));
			if (e0==null) {
				VarList ve=(VarList) e1;
				vd.addList(ve.getMap());
				return vd;
			}
			else {
				VarList ve0=(VarList) e0;
				VarList ve1=(VarList) e1;
				vd.addList(ve0.getMap());
				vd.addList(ve1.getMap()); 

				return vd;
				
			}
			
			
		}
	}


	@Override
	public Expression visitDecl(DeclContext ctx) {
		Path.add("VisitDecl");
		String id=ctx.getChild(1).getText();
		this.currentType=(Type) visit(ctx.getChild(4));
		VariableDecleration vd=new VariableDecleration(id,currentType.type,0,"");
		if (vars.containsKey(id)) {
			semanticErrors.add("Error:"+" Variable "+ id +" is already declared");
		}
		else {
			vars.put(id, new VariableDecleration(id,currentType.type,0,"VAR"+String.valueOf(varMem-1999)));
			file.add("VAR"+String.valueOf(varMem-1999)+"\t\tEQU\t\t"+varMem+"\n");
			varMem=varMem+1;
		}
		Expression e=visit(ctx.getChild(2));
		if (e==null) {
			VarList vl=new VarList();
			vl.add(vd);
			return vl;
		}
		else {
			VarList vl=(VarList) e;
			vl.add(vd);
			return vl;
		}
	}
	@Override
	public Expression visitVars(VarsContext ctx) {
		Path.add("VisitVars");
		if (ctx.getChildCount()==0) {
			return null;
		}
		else {
			String id=ctx.getChild(1).getText();
			
			if (vars.containsKey(id)) {
				semanticErrors.add("Error:"+" Variable "+ id +" is already declared");
			}
			else {
				vars.put(id, new VariableDecleration(id,currentType.type,0,"VAR"+String.valueOf(varMem-1999)));
				file.add("VAR"+String.valueOf(varMem-1999)+"\t\tEQU\t\t"+varMem+"\n");
				varMem=varMem+1;
			}
			
			Expression e=visit(ctx.getChild(2));
			if (e==null) {
				VarList vs = new VarList();
				if (vs.getMap().containsKey(id)) {
					Token idToken=ctx.ID().getSymbol();
					int line=idToken.getLine(), col=idToken.getCharPositionInLine()+1;
					semanticErrors.add("Error: Line:"+Integer.valueOf(line).toString() +" Column:"+ Integer.valueOf(col).toString() + " Variable "+ id +" is already declared");
				}
				VariableDecleration v=new VariableDecleration(id,currentType.type,0,"");
				vs.add(v);
				return vs;
			}
			else {
				VarList vs = (VarList) e;
				if (vs.getMap().containsKey(id)) {
					Token idToken=ctx.ID().getSymbol();
					int line=idToken.getLine(), col=idToken.getCharPositionInLine()+1;
					semanticErrors.add("Error: Line:"+Integer.valueOf(line).toString() +" Column:"+ Integer.valueOf(col).toString() + " Variable "+ id +" is already declared");
				}
				VariableDecleration v=new VariableDecleration(id,currentType.type,0,"");
				vs.add(v);
				return vs;
			}
			
		}
	}
	@Override
	public Expression visitType(TypeContext ctx) {
		Path.add("VisitType");
		return new Type(ctx.getChild(0).getText());
	}

	@Override
	public Expression visitStmts(StmtsContext ctx) {
		Path.add("visitStmts");


		if (ctx.getChildCount()==0) {
			if (Start==1) {
			file.add("ERROR\t\tEQU\t\t3998\n");
			file.add("BIN\t\tEQU\t\t3999\n");
			file.add("START\t\tEQU\t\t100\n");
			file.add("\t\tORIG\t\tSTART\n");
			Start=0;
			}
			return null;
		}
		else {
			Expression e=visit(ctx.getChild(0));
			if (e instanceof BreakState && codeGen==0) {
				return e;
			}
			else if (e instanceof ContState && codeGen==0){
				return e;
			}
			else {
				return visit(ctx.getChild(1));
			}
		}
	}

	@Override
	public Expression visitStmt(StmtContext ctx) {
		Path.add("visitStmt");
		index=3500;
		if (ctx.getChild(0).getText()==";") {
			return null;
		}
		else {
			return visit(ctx.getChild(0));
		}
	}

	@Override
	public Expression visitAssignExp(AssignExpContext ctx) {
		Path.add("visitAssignExp");
		String idString=ctx.getChild(0).getText();
		Expression right=visit(ctx.getChild(2));
		String ops=((ASOP)visit(ctx.getChild(1))).op;
		if (vars.get(idString)==null) {
			Token idToken=ctx.ID().getSymbol();
			int line=idToken.getLine(), col=idToken.getCharPositionInLine()+1;
			semanticErrors.add("Error: Line:"+Integer.valueOf(line).toString() +" Column:"+ Integer.valueOf(col).toString() +" "+ "The variable "+idString+" is not defined");
			return null;
		}
		VariableDecleration var=vars.get(idString);
		int r=0;
		if (right instanceof Num) {
			r=((Num) right).num;
		}
		else if (right instanceof Variable) {
			String idr=((Variable) right).id;
			r=vars.get(idr).value;
		}
		else if (right instanceof UnopExp) {
			r=((UnopExp) right).result;
		}
		else if (right instanceof BinaryExp) {
			r=((BinaryExp) right).result;
		}
		else {
			semanticErrors.add("Error: var is null");
		}
		AssignExp nv=new AssignExp(var,ops ,r,index-1);
		file.add("\n*Assign Expression\n");
		for (String s:nv.getCode()) {
			file.add(s);
		}
		var.setValue(nv.result);
		vars.put(var.id, var);
		return nv;
	}

	@Override
	public Expression visitPrintExp(PrintExpContext ctx) {
		Path.add("visitPrintExp");
		PrintExpression e=new PrintExpression(visit(ctx.getChild(1)));
		if (semanticErrors.isEmpty()) {
			file.add("\n*Print Expression\n");
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			if (e.exp instanceof Num) {
				Num n =(Num) e.exp;
				System.out.println(n.num);
			}
			else if (e.exp instanceof Variable) {
				Variable n =(Variable) e.exp;
				System.out.println(vars.get(n.id).value);
				file.add("\t\tLDA\t\t"+vars.get(n.id).memory+"\n");

			}
			else if (e.exp instanceof UnopExp) {
				UnopExp n =(UnopExp) e.exp;
				System.out.println(n.result);
			}
			else if (e.exp instanceof BinaryExp) {
				BinaryExp n =(BinaryExp) e.exp;
				System.out.println(n.result);
			}
			file.add("\t\tENTX\t\t44\n");
			file.add("\t\tJANN\t\t*+2\n");
			file.add("\t\tENTX\t\t45\n");
			file.add("\t\tSTX\t\tSIGN\n");
			file.add("\t\tCHAR\n");
			file.add("\t\tSTA\t\tHALF1\n");
			file.add("\t\tSTX\t\tHALF2\n");
			file.add("\t\tOUT\t\tSIGN(19)\n");
			file.add("\t\tENTX\t\t0\n");
		}
		return e;
	}
	
	@Override
	public Expression visitIfStatement(IfStatementContext ctx) {
		Expression e=visit(ctx.getChild(2));
		int ifStart=0;
		index=index-1;
		file.add("\n*If Statement\n");
		file.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
		file.add("\t\tCMPA\t\t="+String.valueOf(1)+"=\n");
		ifStart=file.size();
		file.add("\t\tJL\t\tPLACEHOLDER\n");
		Expression exp = null;
		int result=0;
		int in=index;

		if (e instanceof Num) {
			Num en=(Num) e;
			result=en.num;
			
		}
		else if (e instanceof Variable) {
			String idString=((Variable) e).id;
			VariableDecleration v=vars.get(idString);
			result=v.value;
			
		}
		else if (e instanceof UnopExp) {
			UnopExp en=(UnopExp) e;
			result=en.result;
		}
		else if (e instanceof BinaryExp) {
			BinaryExp en=(BinaryExp) e;
			result=en.result;
		}
		else {
			semanticErrors.add("Error in if expression");
			exp= null;
		}
		int move;
		if (result !=0 || codeGen==1) {
			move=1;
			file.add("\n*IF TRUE\n");
			exp= visit(ctx.getChild(4));
			for (int i=ifStart+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			file.add("\t\tJMP\t\tPLACEHOLDER\n");
			file.set(ifStart, "\t\tJL\t\t*+"+String.valueOf(move+1)+"\n");
			ifStart=file.size()-1;
		}
		if (result==0 || codeGen==1){
			index=in;
			exp= visit(ctx.getChild(5));
			move=1;
			for (int i=ifStart+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			file.set(ifStart, "\t\tJMP\t\t*+"+String.valueOf(move)+"\n");
		}

		file.add("\n*End If Statement\n");

		return exp;
		
	}
	@Override
	public Expression visitWhileStatement(WhileStatementContext ctx) {
		Expression body,e2=visit(ctx.getChild(2));
		int jIndex=0;
		int n=0;
		if (e2 instanceof Num) {
			n=((Num)e2).num;
		}
		else if (e2 instanceof Variable) {
			n=vars.get(((Variable)e2).id).value;
		}
		else if (e2 instanceof UnopExp) {
			n=((UnopExp)e2).result;
		}
		else if (e2 instanceof BinaryExp) {
			n=((BinaryExp)e2).result;
		}
		else {
			semanticErrors.add("Error in While condition");
		}
		file.add("\n*START While Statement\n");
		file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
		file.add("\t\tCMPA\t\t=1=\n");
		jIndex=file.size();
		file.add("\t\tJL\t\tPLACEHOLDER\n");
		
		int move=1;

		if (codeGen==1) {
			body=visit(ctx.getChild(4)); //block
			

			String s;
			//ArrayList<Integer> conts=new ArrayList<Integer>();
			int cnt=0;
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					/*if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
						conts.add(move);
					}*/
					move++;
				}
			}
			cnt=1;
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (!file.get(i).contains("\n*")) {
					cnt++;
					if (s.contains("PLACEHOLDERCONTINUE")) {
						s=s.replace("PLACEHOLDERCONTINUE", "*+"+String.valueOf(move-cnt+1));
						file.set(i, s);
					}
				}
			}
			/*for (int i=jIndex+1;i<file.size();i++) {
				if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
					s=file.get(i);
					s=s.replace("PLACEHOLDERCONTINUE", "*+"+String.valueOf(move-conts.get(cnt)));
					file.set(i, s);
					cnt=cnt+1;
				}
			}*/
			file.add("\n*Re-check condition\n");
			e2=visit(ctx.getChild(2)); //check condition
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tCMPA\t\t=1=\n");
			
			
			
			/*
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (s.contains("PLACEHOLDERBREAK")) {
					s=s.replace("PLACEHOLDERBREAK","*+"+String.valueOf(move+1));
					file.set(i, s);
				}
			}*/
			move=1;
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					/*if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
						conts.add(move);
					}*/
					move++;
				}
			}
			cnt=1;
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (!file.get(i).contains("\n*")) {
					cnt++;
					if (s.contains("PLACEHOLDERBREAK")) {
						s=s.replace("PLACEHOLDERBREAK", "*+"+String.valueOf(move-cnt+2));
						file.set(i, s);
					}
				}
			}
		}
			
			file.set(jIndex, "\t\tJL\t\t*+"+String.valueOf(move+1)+"\n");
			file.add("\t\tJGE\t\t*-"+String.valueOf(move-1)+"\n");
			

		
		while (n!=0 && codeGen==0) {
			
			body=visit(ctx.getChild(4));
			if (body instanceof BreakState) {
				break;
			}
			
			e2=visit(ctx.getChild(2));
			if (e2 instanceof Num) {
				n=((Num)e2).num;
			}
			else if (e2 instanceof Variable) {
				n=vars.get(((Variable)e2).id).value;
			}
			else if (e2 instanceof UnopExp) {
				n=((UnopExp)e2).result;
			}
			else if (e2 instanceof BinaryExp) {
				n=((BinaryExp)e2).result;
			}
			else {
				semanticErrors.add("Error in While condition");
			}
		}
		file.add("\n*END While Statement\n");
		return null;
	}
	@Override
	public Expression visitForStatement(ForStatementContext ctx) {
		visit(ctx.getChild(2));
		Expression body,e2=visit(ctx.getChild(4));
		int n=0;
		int jIndex,move=1;
		if (e2 instanceof Num) {
			n=((Num)e2).num;
		}
		else if (e2 instanceof Variable) {
			n=vars.get(((Variable)e2).id).value;
		}
		else if (e2 instanceof UnopExp) {
			n=((UnopExp)e2).result;
		}
		else if (e2 instanceof BinaryExp) {
			n=((BinaryExp)e2).result;
		}
		else {
			semanticErrors.add("Error in For condition");
		}
		file.add("\n*START For Loop\n");
		file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
		file.add("\t\tCMPA\t\t=1=\n");
		jIndex=file.size();
		file.add("\t\tJL\t\tPLACEHOLDER\n");
		
		if (codeGen==1) {
			body=visit(ctx.getChild(8));//Body

			String s;
			//ArrayList<Integer> conts=new ArrayList<Integer>();
			int cnt=0;
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					/*if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
						conts.add(move);
					}*/
					move++;
				}
			}
			cnt=1;
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (!file.get(i).contains("\n*")) {
					cnt++;
					if (s.contains("PLACEHOLDERCONTINUE")) {
						s=s.replace("PLACEHOLDERCONTINUE", "*+"+String.valueOf(move-cnt+1));
						file.set(i, s);
					}
				}
			}
			
			
			/*for (int i=jIndex+1;i<file.size();i++) {
				if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
					s=file.get(i);
					s=s.replace("PLACEHOLDERCONTINUE", "*+"+String.valueOf(move-conts.get(cnt)));
					file.set(i, s);
					cnt=cnt+1;
				}
			}*/
			file.add("\n*Stuff at the end of for\n");
			visit(ctx.getChild(6));//Stuff at end of for
			file.add("\n*Re-check condition\n");
			e2=visit(ctx.getChild(4));//Check condition
			
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tCMPA\t\t=1=\n");
			/*move=1;
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (s.contains("PLACEHOLDERBREAK")) {
					s=s.replace("PLACEHOLDERBREAK","*+"+String.valueOf(move+1));
					file.set(i, s);
				}
			}*/
			move=1;
			for (int i=jIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					/*if (file.get(i).contains("PLACEHOLDERCONTINUE")) {
						conts.add(move);
					}*/
					move++;
				}
			}
			cnt=1;
			for (int i=jIndex+1;i<file.size();i++) {
				s=file.get(i);
				if (!file.get(i).contains("\n*")) {
					cnt++;
					if (s.contains("PLACEHOLDERBREAK")) {
						s=s.replace("PLACEHOLDERBREAK", "*+"+String.valueOf(move-cnt+2));
						file.set(i, s);
					}
				}
			}
			
			file.set(jIndex, "\t\tJL\t\t*+"+String.valueOf(move+1)+"\n");
			file.add("\t\tJGE\t\t*-"+String.valueOf(move-1)+"\n");
		}
		
		while (n!=0 && codeGen==0) {
			
			body=visit(ctx.getChild(8));
			if (body instanceof BreakState) {
				break;
			}
			
			visit(ctx.getChild(6));
			e2=visit(ctx.getChild(4));
			if (e2 instanceof Num) {
				n=((Num)e2).num;
			}
			else if (e2 instanceof Variable) {
				n=vars.get(((Variable)e2).id).value;
			}
			else if (e2 instanceof UnopExp) {
				n=((UnopExp)e2).result;
			}
			else if (e2 instanceof BinaryExp) {
				n=((BinaryExp)e2).result;
			}
			else {
				semanticErrors.add("Error in For condition");
			}
		}
		file.add("\n*END For Statement\n");
		return null;
	}
	@Override
	public Expression visitContCommand(ContCommandContext ctx) {
		file.add("\n*CONTINUE\n");
		file.add("\t\tJMP\t\tPLACEHOLDERCONTINUE\n");
		
		return new ContState();
	}
	@Override
	public Expression visitBreakCommand(BreakCommandContext ctx) {
		file.add("\n*BREAK\n");
		file.add("\t\tJMP\t\tPLACEHOLDERBREAK\n");
		


		return new BreakState();
	}
	@Override
	public Expression visitElseblck(ElseblckContext ctx) {
		file.add("\n*Start Else Block\n");
		if (ctx.getChildCount()==0) {
			return null;
		}
		else {
			Expression e=visit(ctx.getChild(1));
			file.add("\n*End Else Block\n");
			return e;

		}
	}

	@Override
	public Expression visitBlock(BlockContext ctx) {
		Expression e;

		if (ctx.getChildCount()==1) {
			e= visit(ctx.getChild(0));
		}
		else {
			e= visit(ctx.getChild(1));
		}
		return e;

	}

	@Override
	public Expression visitVariable(VariableContext ctx) {
		Token idToken=ctx.ID().getSymbol();
		int line=idToken.getLine(), col=idToken.getCharPositionInLine()+1;
		String id=ctx.getChild(0).getText();
		if (!vars.containsKey(id)) {
			semanticErrors.add("Error: Line:"+Integer.valueOf(line).toString() +" Column:"+ Integer.valueOf(col).toString() +" "+ "The variable "+id+" is not defined");
		}
		file.add("\n*Load Variable\n");
		file.add("\t\tENTA\t\t0\n");
		file.add("\t\tLDA\t\t"+vars.get(id).memory+"\n");
		file.add("\t\tSTA\t\t"+String.valueOf(index)+"\n");
		index=index+1;

		return new Variable(id);		
	}
	@Override
	public Expression visitBinopMulDiVModExp(BinopMulDiVModExpContext ctx) {
		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		
		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
		
		file.add("\n*Binary Expression\n");
			
			
		
		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	@Override
	public Expression visitBinopPlusMinExp(BinopPlusMinExpContext ctx) {

		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
			file.add("\n*Binary Expression\n");

		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	@Override
	public Expression visitBinopCompExp(BinopCompExpContext ctx) {
		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
		
		file.add("\n*Binary Expression\n");
			
			
		
		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	@Override
	public Expression visitBinopEqNeqExp(BinopEqNeqExpContext ctx) {

		
		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		
		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
		
		file.add("\n*Binary Expression\n");
			
			
		
		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	@Override
	public Expression visitBinopAndExp(BinopAndExpContext ctx) {

		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		int bIndex=0;
			file.add("\n*Binary Expression(1st Half)\n");
			
			file.add("\t\tENTA\t\t0\n");
			file.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tENTX\t\t1\n");
			
			
			file.add("\t\tCMPA\t\t=1=\n");
			bIndex=file.size();
			file.add("\t\tJL\t\t"+"*+11\n");
			file.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");
		
		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
		int move=1;
			file.add("\n*Binary Expression(2nd Half)\n");
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tCMPA\t\t=1=\n");
			file.add("\t\tJGE\t\t"+"*+3\n");
			file.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");
			for (int i=bIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			file.set(bIndex, "\t\tJL\t\t*+"+String.valueOf(move+1)+"\n");
			file.add("\t\tLDA\t\tBIN\n");
			file.add("\t\tSTA\t\t"+String.valueOf(index-2)+"\n");
		
		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	@Override
	public Expression visitBinopOrExp(BinopOrExpContext ctx) {
		String ops=ctx.getChild(1).getText();
		int l=0,r=0;
		
		Expression left=visit(ctx.getChild(0));
		if (left instanceof Num) {
			Num en=(Num) left;
			l=en.num;
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			l=vars.get(evd.id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			l=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			l=evd.result;
		}
		int bIndex=0;
			file.add("\n*Binary Expression\n");
			file.add("\t\tENTA\t\t0\n");
			file.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tENTX\t\t1\n");
			
			
			file.add("\t\tCMPA\t\t=1=\n");
			bIndex=file.size();
			file.add("\t\tJGE\t\t"+"*+12\n");
			file.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");

		Expression right=visit(ctx.getChild(2));

		
		if (right instanceof Num) {
			Num en=(Num) right;
			r=en.num;
		}
		
		else if (right instanceof Variable) {
			Variable evda=(Variable) right;
			r=vars.get(evda.id).value;
		}
		else if (right instanceof UnopExp) {
			UnopExp evda=(UnopExp) right;
			r=evda.result;
		}
		else if (right instanceof BinaryExp) {
			BinaryExp evda=(BinaryExp) right;
			r=evda.result;
		}
		BinaryExp be=new BinaryExp(l, ops,r,index-1,codeGen);
		int move=1;
			file.add("\n*Binary Expression(2nd Half)\n");
			file.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			file.add("\t\tCMPA\t\t=1=\n");
			file.add("\t\tJL\t\t"+"*+3\n");
			file.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			file.add("\t\tSTA\t\tBIN\n");
			for (int i=bIndex+1;i<file.size();i++) {
				if (!file.get(i).contains("\n*")) {
					move++;
				}
			}
			file.set(bIndex, "\t\tJGE\t\t*+"+String.valueOf(move+1)+"\n");
			file.add("\t\tLDA\t\tBIN\n");
			file.add("\t\tSTA\t\t"+String.valueOf(index-2)+"\n");
		for (String s:be.getCode()) {
			file.add(s);
		}
		index=index-1;
		return be;
	
	}
	
	@Override
	public Expression visitNum(NumContext ctx) {
		String numtext=ctx.getChild(0).getText();
		int num=Integer.parseInt(numtext);
		file.add("\n*Load Number\n");

		file.add("\t\tENTA\t\t0\n");
		file.add("\t\tLDA\t\t="+numtext+"=\n");
		file.add("\t\tSTA\t\t"+index+"\n");
		index=index+1;
		
		return new Num(num);
	}

	@Override
	public Expression visitPexp(PexpContext ctx) {
		return visit(ctx.getChild(1));
	}

	@Override
	public Expression visitUnopNotExp(UnopNotExpContext ctx) {
		Expression left=visit(ctx.getChild(1));
		String ops=ctx.getChild(0).getText();
		int num=0;

		if (left instanceof Num) {
			Num en=(Num) left;
			num=en.getNumber();
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			num=vars.get(((Variable) evd).id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			num=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			num=evd.result;
		}

		UnopExp n=new UnopExp(num, ops,index-1);
		file.add("\n*UNOP Expression\n");

		for (String s:n.getCode()) {
			file.add(s);
		}
		return n;
	}
	@Override
	public Expression visitUnopRSExp(UnopRSExpContext ctx) {
		Expression left=visit(ctx.getChild(1));
		String ops=ctx.getChild(0).getText();
		int num=0;

		if (left instanceof Num) {
			Num en=(Num) left;
			num=en.getNumber();
		}
		else if (left instanceof Variable) {
			Variable evd=(Variable) left;
			num=vars.get(((Variable) evd).id).value;
		}
		else if (left instanceof UnopExp) {
			UnopExp evd=(UnopExp) left;
			num=evd.result;
		}
		else if (left instanceof BinaryExp) {
			BinaryExp evd=(BinaryExp) left;
			num=evd.result;
		}

		UnopExp n=new UnopExp(num, ops,index-1);
		file.add("\n*UNOP Expression\n");

		for (String s:n.getCode()) {
			file.add(s);
		}
		return n;
	}

	@Override
	public Expression visitAsop(AsopContext ctx) {
		return new ASOP(ctx.getChild(0).getText());
	}
		
}