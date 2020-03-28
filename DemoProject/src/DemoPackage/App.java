package DemoPackage;
import java.util.Scanner;

public class App {
	public static void main (String args[]) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter your input");
		String data = obj1.nextLine();
		/*int line = 0;
		do {
		line = obj1.nextInt();
		System.out.println("You entered"+" "+line);
		} while (line != 5);
		System.out.println("Got 5 !" +""+line);*/
		
		switch(data) {
			case "start":  
				System.out.println("Please start program");
				break;
				
			case "stop":
				System.out.println("Please stop program");
				break;
				
			default:
				System.out.println("Do nothing");
				break;
			}
		}
	}


