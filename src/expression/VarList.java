package expression;

import java.util.HashMap;
import java.util.Map;

public class VarList extends Expression {
	public Map<String,VariableDecleration> vars;
	public VarList() {
		vars=new HashMap<>();
	}
	public void add(VariableDecleration e) {
		vars.put(e.id, e);
	}
	public Map<String,VariableDecleration> getMap(){
		return vars;
	}

}
