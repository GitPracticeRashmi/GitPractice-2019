package DemoPackage;
interface HasExoskeleton {
	abstract int getNumberOfSections();
}

abstract class Insect implements HasExoskeleton{
	abstract int getNumberOfLegs();
	
}

public class Beetle extends Insect {
	public int getNumberOfSections()
	{
		return 8;
	}
	int getNumberOfLegs()
	{
		return 6;
	}

}
