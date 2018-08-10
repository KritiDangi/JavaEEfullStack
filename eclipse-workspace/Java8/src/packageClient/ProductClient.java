package packageClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import packageEntity.Product;

public class ProductClient {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1230, "iPhone X", 120000.00, "mobile"));
		products.add(new Product(412, "Onida", 3500.00, "tv"));
		products.add(new Product(734, "Oppo", 6000.00, "mobile"));
		products.add(new Product(652, "Logitech", 450.00, "computer"));
		
		//Prints the name off all products with category mobile.
		products.stream().filter(p->p.getCategory().equals("mobile"))
		.map(p->p.getName())
		.forEach(System.out::println);
		
		// same thing using method reference in place of lambda exp
		products.stream().filter(ProductClient::isMobile)
		.map(p->p.getName())
		.forEachOrdered(System.out::println);
		
		List<Product> mobiles = products.stream()
				.filter(ProductClient::isMobile)
				.collect(Collectors.toList());
		
		mobiles.forEach(p->System.out.println(p.getName()+" : "+p.getCategory()+" : "+p.getPrice()));
	
		double total=products.stream().map(p->p.getPrice()).reduce(0.0, (v1,v2)->v1+v2);
		System.out.println(total);
		
		Map<String,List<Product>> categoryMap=
				products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
		
		categoryMap.forEach((k,v)->{
			System.out.println("category: "+k);
			v.forEach(System.out::println);
		});
		
	}
	
	private static boolean isMobile(Product p) {
		return p.getCategory().equals("mobile");
	}

}
