package DemoPackage;

public class StaticPractice {
	int i = 4;
	public static void main (String[] args) {
		//int i = 4;
		System.out.println("this call is direct to  :" + i);
		StaticPractice s = new StaticPractice();
		StaticPractice s1 = new StaticPractice();
		StaticPractice s2 = new StaticPractice();
		s.callnonstatic();// a method is required for non static
		s1.callnonstatic();
		s2.callnonstatic();
		callstatic();// static without object
		
	}
	
	void callnonstatic() {
		//int j = i + 3;
		i++;
		System.out.println("this from non static method  :" + i);
		
	}
    static void callstatic() {
    	 i++;
		//int i = j;
    	System.out.println("this from  static method  :" + i);
    	
    }
}
