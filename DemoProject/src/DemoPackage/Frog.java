package DemoPackage;

public class Frog implements CanHop {
	

	public static void main (String[] args) {
		CanHop frog = new TurtleFrog();
	}

}

public class BrazilianHornedFrog extends Frog {}
public class TurtleFrog extends Frog {}
