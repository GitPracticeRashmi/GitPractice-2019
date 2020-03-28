package DemoPackage;

import java.time.LocalDate;
import java.time.Month;

public class Periodpractice {
	public static void main(String[] args)
	{
		LocalDate start = LocalDate.of(2019, Month.JANUARY,1);
		LocalDate end = LocalDate.of(2019, Month.MARCH,30);
		performanimal(start,end);
	}
  private static void performanimal(LocalDate start,LocalDate end)
  {
	  LocalDate upto = start;
	  while(upto.isBefore(end)){
		  System.out.println("give new toy:" + upto);
		  upto=upto.plusMonths(1);
	  }
  }
}
