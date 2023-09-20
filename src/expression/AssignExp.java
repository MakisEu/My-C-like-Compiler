package expression;

import java.util.ArrayList;
import java.util.List;

public class AssignExp extends Expression {
	public int result;
	public String id, instr="";
	public List<String> code;
	public AssignExp(VariableDecleration var,String op,int right,int index) {
		int left=var.value;
		String leftID=var.id;
		id=leftID;
		code= new ArrayList<String>();	
		
		code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
		code.add("\t\tLDA\t\t"+var.memory+"\n");



		if (op.equals("=")) {
			result=right;
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTA\t\t"+var.memory+"\n");
		}
		else if (op.equals("+=")) {
			result=left+right;
			code.add("\t\tADD\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTA\t\t"+var.memory+"\n");
			
		}
		else if (op.equals("-=")) {
			result=left-right;
			code.add("\t\tSUB\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTA\t\t"+var.memory+"\n");
		}
		else if (op.equals("*=")) {
			result=left*right;
			code.add("\t\tMUL\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTX\t\t"+var.memory+"\n");

		}
		else if (op.equals("/=")) {
			result=left/right;
			
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tCMPA\t\t=0=\n");
			code.add("\t\tJNE\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
			
			code.add("\t\tLDX\t\t"+var.memory+"\n");
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
		    code.add("\t\tENT1\t\t1\n");
		    code.add("\t\tJXNN\t\t*+2\n"); // Keep the sign
		    code.add("\t\tENT1\t\t-1\n");
		    code.add("\t\tST1\t\t"+var.memory+"\n");
		    code.add("\t\tDIV\t\t"+String.valueOf(index)+"\n");
		    code.add("\t\tMUL\t\t"+var.memory+"\n");
		    code.add("\t\tSTX\t\t"+var.memory+"\n");
		    
			code.add("\t\tJNOV\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
			
		}
		else if (op.equals("%=")) {
			result=left%right;
			
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tCMPA\t\t=0=\n");
			code.add("\t\tJNE\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
			
			code.add("\t\tLDA\t\t"+var.memory+"\n");
			code.add("\t\tLDX\t\t"+var.memory+"\n");

			
		    code.add("\t\tENT1\t\t1\n");
		    code.add("\t\tJXNN\t\t*+2\n"); // Keep the sign
		    code.add("\t\tENT1\t\t-1\n");
		    code.add("\t\tST1\t\t"+String.valueOf(index+1)+"\n");
			
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
		    code.add("\t\tDIV\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTX\t\t"+var.memory+"\n");
			code.add("\t\tLDA\t\t"+var.memory+"\n");
		    code.add("\t\tMUL\t\t"+String.valueOf(index+1)+"\n");
			code.add("\t\tSTX\t\t"+var.memory+"\n");
			
			code.add("\t\tJNOV\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
		}
	}
	public List<String> getCode(){
		return code;
	}
	

}
