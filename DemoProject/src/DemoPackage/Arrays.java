package DemoPackage;

public class Arrays {
	public static void main(String[] args)
	{
	   String[] strings = { "stringvalue" };
	   Object[] objects = strings;
	   String[] againStrings = (String[]) objects;
	   //againStrings[0] = new StringBuilder();
	   objects[0] = new StringBuilder();
	   System.out.println(strings);
	   System.out.println(strings[0]);
	   //System.out.println(objects[0]);
	   System.out.println(againStrings);
		
	}

}
