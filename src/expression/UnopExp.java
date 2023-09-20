package expression;

import java.util.ArrayList;
import java.util.List;

public class UnopExp extends Expression{
	public int result;
	public String op;
	public List<String> code;
	public UnopExp(int number,String op,int index) {
		this.op=op;
		code= new ArrayList<String>();

		code.add("\t\tENTA\t\t"+String.valueOf(0)+"\n");

		if (op.equals("-")) {
			result=number*(-1);
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tMUL\t\t="+String.valueOf(-1)+"=\n");
			code.add("\t\tSTX\t\t"+String.valueOf(index)+"\n");
			
		}
		else {
			if (number>0) {
				result=0;
			}
			else {
				result=1;
			}
			code.add("\t\tLDA\t\t="+String.valueOf(1)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\t"+String.valueOf(index)+"\n");
			code.add("\t\tCMPA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tJLE\t\t*+3\n");
			code.add("\t\tLDA\t\t="+String.valueOf(0)+"=\n");
			code.add("\t\tSTA\t\tBIN\n");
			code.add("\t\tLDA\t\tBIN\n");
			code.add("\t\tSTA\t\t"+String.valueOf(index)+"\n");
		}
	}
	public int getNum() {
		return result;
	}
	public String getOp() {
		return op;
	}
	public List<String> getCode(){
		
		return code;
	}
}
