package DemoPackage;

public class Koala {
	static int count = 0;
	public static void main (String[] args)
	{
		System.out.println(count);
		Koala k = new Koala();
		Koala k1 = new Koala();
		Koala k2 = new Koala();
		k1.count = 5;
	    k2.count = 6;
		System.out.println(k.count);
		k = null;
		System.out.println(k1.count);
		System.out.println(k2.count);
	}
	
	

}
