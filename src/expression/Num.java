package expression;



public class Num extends Expression {
	int num;
	public Num(int num) {
		this.num = num;
	}
	@SuppressWarnings("removal")
	@Override
	public String toString() {
		return new Integer(num).toString();
	}
	public int getNumber() {
		return num;
	}
}
