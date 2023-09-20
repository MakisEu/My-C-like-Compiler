package expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Declerations extends Expression {
	public List<VariableDecleration> declarations; 
	public Declerations() {
		declarations= new ArrayList<VariableDecleration>();
	}
	public void addList(Map<String, VariableDecleration> map) {
		for (String vd: map.keySet()) {
			declarations.add(map.get(vd));
		}
	}
	public List<VariableDecleration> getList() {
		return declarations;
	}
}
