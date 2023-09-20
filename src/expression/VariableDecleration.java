package expression;

public class VariableDecleration extends Expression {
	public String id;
	public String type,memory;
	public int value;
	
	public VariableDecleration(String id, String type, int value,String memory) {
		this.id=id;
		this.type=type;
		this.value= value;
		this.memory=memory;
		
	}
	public void setValue(int val) {
		value=val;
	}

}
