package DemoPackage;


  
 public class Greetings2 {
     String msg = null;
     
     public Greetings2() {
         this("Good Morning!");
     }
     
     public Greetings2(String str) {
         msg = str;
     }
     
     public void displayMsg() {
         System.out.println(msg);
     }     
 public static void main(String [] args) {
         Greetings g1 = new Greetings();
         Greetings g2 = new Greetings("Good Evening!");
         g1.displayMsg();
         g2.displayMsg();
     }
 }

