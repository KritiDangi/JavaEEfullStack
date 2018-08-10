package packageEntity;

import java.util.List;
import java.util.ArrayList;

public class Employee {

	private String name;
	private List<String> languages=new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	public Employee() {
		super();
	}
	
	
}
