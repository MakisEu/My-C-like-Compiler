package expression;

public class AssignOP extends Expression {
	Expression left;
	Expression right;
	String op;
	public AssignOP(Expression left, Expression right,String op) {
		this.left=left;
		this.right=right;
		this.op=op;
	}
	@Override
	public String toString() {
		return left.toString()+" "+op+" "+right.toString();
	}
}
