package DemoPackage;

public class StringPractice {
	public static void main (String[] args) {
	String mystring = "This is my first string practice";
	
	System.out.println(mystring.length());
	System.out.println(mystring.charAt(9));
	System.out.println(mystring.indexOf('i',8));
	System.out.println(mystring.substring(7,11));
	System.out.println(mystring.equals("This is my first string practice"));
	System.out.println(mystring.replace("this","second"));
	
	System.out.println(mystring.toUpperCase());
	String b = mystring.toUpperCase();
	System.out.println(b); 

}
}