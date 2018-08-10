package packageClient;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> sales = new HashMap<>();
		sales.put("Java", 100);
		sales.put("Oracle", 138);
		sales.put("Javascript", 300);

		if(sales.containsKey("Java"))
			System.out.println("Sales of java books: "+sales.get("Java"));
		
		int count=sales.get("Java");
		count=count+10;
		sales.put("Java", count);
		/*
		for (String key : sales.keySet()) {
			System.out.println(key+" : "+sales.get(key));
		}
		*/
		sales.forEach((k,v)->System.out.println(k+" : "+v));
		
		/*****************************************************/
		
		String report="ramesh sold 500 products of iPhone each costing 98000";
		
		String[] tokens=report.split(" ");
		
		Map<String,Integer> m1=new HashMap<>();
		m1.put("words", 0);
		m1.put("numbers", 0);
		Map<String,List<String>> m2=new HashMap<>();
		List<String> li=new ArrayList<>();
		m2.put("words",new ArrayList<>());
		m2.put("numbers", new ArrayList<>());
		m2.forEach((k,v)->System.out.println(k+" : "+v));
		for (String string : tokens) {
			if(isInteger(string)) {
				int n=m1.get("numbers");
				n++;
				m1.put("numbers", n);
				
				m2.get("numbers").add(string);
				//m2.forEach((k,v)->System.out.println(k+" : "+v));
				//li.add(string);
				//m2.put("numbers", li);
			}else {
				int n=m1.get("words");
				n++;
				m1.put("words", n);
				m2.get("words").add(string);
				//m2.forEach((k,v)->System.out.println(k+" : "+v));
			}			
		}
		
		m1.forEach((k,v)->System.out.println(k+" : "+v));
		m2.forEach((k,v)->System.out.println(k+" : "+v));
	}
	
	
	
	public static boolean isInteger(String input1) {
		boolean isInteger=false;
		try 
        {
            // checking valid integer using parseInt() method
            Integer.parseInt(input1);
            isInteger=true;
        } 
        catch (NumberFormatException e) 
        {
            
        }
		return isInteger;
	}

}
