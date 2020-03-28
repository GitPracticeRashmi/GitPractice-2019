package DemoPackage;
import java.time.LocalDate;
public class DatesPractice {
	public static void main (String[] args) {
	LocalDate d = LocalDate.now();	
	LocalDate b = LocalDate.now();
	System.out.println(d);
	b = d.plusDays(10);
	System.out.println(b);
	d = d.plusWeeks(1);
	System.out.println(d);
	
	}
}
