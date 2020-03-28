package DemoPackage;
import java.util.ArrayList;
public class Arraylist {
	public static void main (String[] args)
	{
		ArrayList arylst = new ArrayList();
		arylst.add("hawk");
		arylst.add(Boolean.TRUE);
		
		System.out.println(arylst);
		ArrayList<String> stglst = new ArrayList<>();
		arylst.set(1, "replaced");
		System.out.println(arylst);
	}

}
