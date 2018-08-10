package packageClient;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import packageEntity.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee o1= new Employee();
		Employee o2= new Employee();
		
		o1.setName("George");
		o2.setName("Amy");
		
		o1.setLanguages(Arrays.asList("Java","Python","JS","Go","C#"));
		o2.setLanguages(Arrays.asList("Python","Lisp","C"));
		
		List<Employee> maps=Arrays.asList(o1,o2);
		
		//print only skills
		maps.stream().map(o->o.getLanguages()).forEach(System.out::println);
		
		//print a single list of skills
		Set<String> skills=maps.stream().map(o->o.getLanguages())
		.flatMap(Collection::stream)
		.collect(Collectors.toSet());
		
		System.out.println(skills);
	}

}
