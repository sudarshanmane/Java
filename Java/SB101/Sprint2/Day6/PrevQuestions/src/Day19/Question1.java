package Day19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Question1 {
	
	public static void main(String[] args) {
		
		
		List<Product> list = Arrays.asList(
				new Product(1, "Ganesh", 101),
				new Product(5, "Pawan", 99),
				new Product(4, "Amar", 100));
		

		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) {
			
			Set<Product> price = new TreeSet<>(new Price());
			
			for(Product product : list) {
				price.add(product);
			}
			
			for(Product product : price) {
				System.out.println(product);
			}
			
		}else if(num == 2) {

			Set<Product> products = new TreeSet<Product>(new Name());	
			
			for(Product product : list){
				products.add(product);
			}
			
			for(Product name : products){
                 System.out.println(name);
			}
			
		}
		
		
	}
	
	

}

class Product  {
	
	
	 private int productId;
	 private String productName;
	 private double productPrice;
	 
	 int num = 0;
	 
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	
	 

}

class Price implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getProductPrice() > o2.getProductPrice()) {
			return +1;
		}else
		return -1;
	}
	
}

class Name implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		  return o1.getProductName().compareTo(o2.getProductName());
	}
	
	
	
}


