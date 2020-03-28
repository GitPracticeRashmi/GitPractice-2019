package DemoPackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Product {
	double price;
}

public class Test {
	public void updatePrice (Product product,double price) {
		price = price*2;
		product.price = product.price + price;
	}
	public static void main (String[] args)
	{
		Product prt = new Product();
		StringBuilder num = new StringBuilder("01234556");
		num.append("6$");
		System.out.println(num);
		prt.price = 200;
		double newPrice = 100;
		Test t = new Test();
		t.updatePrice(prt,newPrice);
		System.out.println(prt.price + ":"+ newPrice);
		//String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
	//System.out.println(date)	;
	Short s1 = 200;
	Integer s2 = 400;
	Long s3 = (long)s1 + s2;
	//String s4 = (String) (s3*s2);
	//System.out.println("Sum is " + s4);
		
	}

}
