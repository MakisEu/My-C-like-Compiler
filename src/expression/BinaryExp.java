package expression;

import java.util.ArrayList;
import java.util.List;

public class BinaryExp extends Expression {
	public int result,ibool=0;
	public List<String> code;
	
	public BinaryExp(int left, String op,int right,int index,int codeGen) {
		code = new ArrayList<String>();
		
		if (op.equals("*")) {
			result=left*right;
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tMUL\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTX\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("/")) {
			if (codeGen==0) {
			result=left/right;}
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tCMPA\t\t=0=\n");
			code.add("\t\tJNE\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");



			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tLDX\t\t"+String.valueOf(index-1)+"\n");
			
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
		    code.add("\t\tENT1\t\t1\n");
		    code.add("\t\tJXNN\t\t*+2\n"); // Keep the sign
		    code.add("\t\tENT1\t\t-1\n");
		    code.add("\t\tST1\t\t"+String.valueOf(index-1)+"\n");
		    code.add("\t\tDIV\t\t"+String.valueOf(index)+"\n");
		    code.add("\t\tMUL\t\t"+String.valueOf(index-1)+"\n");
		    code.add("\t\tSTX\t\t"+String.valueOf(index-1)+"\n");
		    
			code.add("\t\tJNOV\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
		    


			
		}
		else if (op.equals("+")) {
			result=left+right;
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tADD\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("-")) {
			result=left-right;
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tSUB\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("%")) {
			if (codeGen==0) {
			result=left%right;}
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			
			
			code.add("\t\tCMPA\t\t=0=\n");
			code.add("\t\tJNE\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");
			
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tLDX\t\t"+String.valueOf(index-1)+"\n");
			
		    code.add("\t\tENT1\t\t1\n");
		    code.add("\t\tJXNN\t\t*+2\n"); // Keep the sign
		    code.add("\t\tENT1\t\t-1\n");
		    code.add("\t\tST1\t\t"+String.valueOf(index-1)+"\n");
		    
			code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");
		    code.add("\t\tDIV\t\t"+String.valueOf(index)+"\n");
		    
			code.add("\t\tSTX\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
		    code.add("\t\tMUL\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tSTX\t\t"+String.valueOf(index-1)+"\n");

			
			
			code.add("\t\tJNOV\t\t*+4\n");
			code.add("\t\tLDA\t\t=1=\n");
			code.add("\t\tSTA\t\tERROR\n");
			code.add("\t\tJMP\t\tDIVER\n");

		}
		else if (op.equals("<")) {
			if (left<right) {
				ibool=1;
				result=1;
			
			}
			else {
				result=0;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJL\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");

		}
		else if (op.equals("<=")) {
			if (left<=right) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJLE\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals(">")) {
			if (left>right) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}

			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJG\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
			
		}
		else if (op.equals(">=")) {
			if (left>=right) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJGE\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("==")) {
			if (left==right) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJE\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("!=")) {
			if (left!=right) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index-1)+"\n");
			code.add("\t\tCMPA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tJNE\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index-1)+"\n");
		}
		else if (op.equals("&&")) {
			if (left==1 && right==1) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
		}
		else if (op.equals("||")) {
			if (left==1 || right==1) {
				ibool=1;
				result=1;
			}
			else {
				result=0;
			}
		}
	}	
	public List<String> getCode(){
		return code;
	}
}
