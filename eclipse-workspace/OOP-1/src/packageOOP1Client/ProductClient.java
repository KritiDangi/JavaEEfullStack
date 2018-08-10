package packageOOP1Client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import packageProduct.Mobile;
import packageProduct.Product;
import packageProduct.Tv;
import packageUtility.Utility;

public class ProductClient {

	public static void main(String[] args) {
		Product[] products=new Product[4]; //4 REFERENCES created, not objects
		
		//upcasting below
		products[0]=new Mobile(123,"iPhone x",120000.00,"4G");
		products[1]=new Tv(034,"Onida",3500.00,"CRT");
		products[2]=new Mobile(611,"Moto",12999.00,"4G");
		products[3]=new Tv(72,"Sony Bravia",103500.00,"LED");
		
		//printExpensive(products);
		
		Utility.sort(products);
		for(Product p:products)
			System.out.println(p); //toString() is called
		
		String[] s= {"c","b","a","d"};
		Utility.sort(s);
		for (String string : s) {
			System.out.println(string);
		}		
	}
	
	//ocp
	private static void printExpensive(Product[] products) {
		for(int i=0;i<products.length;++i) {
			if(products[i].isExpensive()) { //Dynamic runtime binding ==> POLYMORPHISM
				System.out.println(products[i].getName()+" , "+products[i].getPrice());
				printDetails(products[i]);
			}
		}
	}
	//NOT ocp
	/*
	private static void printDetails(Product product) {
		if(product instanceof Mobile) {
			Mobile m=(Mobile) product; //downcasting
			System.out.println(m.getConnectivity());
		}else if(product instanceof Tv) {
			Tv m=(Tv) product; //downcasting
			System.out.println(m.getScreenType());
		}		
	}
	*/
	
	//OCP..assuming only way to access data is through getters.
	private static void printDetails(Product product) {
		//using java.lang.reflect
		Method[] methods=product.getClass().getDeclaredMethods();
		for(Method m : methods) {
			if(m.getName().startsWith("get")) {
				try {
					Object ret=m.invoke(product);
					System.out.println(ret);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
