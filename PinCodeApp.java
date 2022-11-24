import java.util.Scanner;


public class PinCodeApp {

	public static void main(String[] args) {
	
		 final short CORRECT_PIN = 1234;
         short pin = 0000;
         byte tries = 0;
         byte maxTries = 3; 
         Scanner keyboard = new Scanner(System.in);
         

         System.out.println ("Enter pin: ");
 		 int pinInput = keyboard.nextInt();
         tries++; 
         
         while( pinInput != CORRECT_PIN  && tries < maxTries ) 
         {
        	 System.out.println ("ACCESS DENIED ");
        	 System.out.println ("Enter your PIN: ");
        	 pinInput = keyboard.nextInt();
        	 tries++; 
        	 
        	 }  
         if (pinInput == CORRECT_PIN ) {
        	 System.out.println ("ACCESS GRANTED ");
         } else if (tries >= maxTries) {
        	 System.out.println ("TOO MANY TRIES. ACCOUNT LOCKED ");
         }
        
     
         
         
     }

}


