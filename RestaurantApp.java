
import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {
        
        // DATA LAYER
        final String CURRENCY = "MDL";
        
        final String FOOD_1_NAME = "Pizza";
        int food_1_available_quantity = 5; 
        final float FOOD_1_PRICE = 75.5f;
        
        final String FOOD_2_NAME = "Mamaliga";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;
        
        final String FOOD_3_NAME = "Salad";
        final float FOOD_3_PRICE = 30f;
        int food_3_available_quantity = 5;
        
        float deliveryThreshold = 200f; 
        float deliveryFee = 50f; 
        

        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU ************\n" +
                        "1. \"%-10s\" %7.2f %s\n" +
                        "2. \"%-10s\" %7.2f %s\n" +
                        "3. \"%-10s\" %7.2f %s\n" +
                        "***************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);

        Scanner in = new Scanner(System.in);
        
     for (int tries = 0; tries <=3; tries++)   {
        System.out.println("Choose an option >>>");
        int option = in.nextInt();

        if (option == 1) {
            System.out.printf("Your choice is:  \"%s\"\n" , FOOD_1_NAME);
        } 
        
        System.out.println("How many do you want?");
        int qty = in.nextInt();
        
        
        if (qty > food_1_available_quantity) {
        	 System.out.printf("You've ordered too many \"%s\", we only have %d units. Please try again!", FOOD_1_NAME, food_1_available_quantity);}
        	if (qty <= food_1_available_quantity) {
        		float tempOrderSum = (qty * FOOD_1_PRICE); 
        	System.out.printf(qty +  " x \"%s\" (%.2f%s) =  " + tempOrderSum + " " + CURRENCY + "\n" + "Confirm order? ( 1 - yes, 0 - no )?", FOOD_1_NAME, FOOD_1_PRICE, CURRENCY );
	        int approval = in.nextInt();
        	 
        	 if(approval == 1) {
        		 System.out.println("THANK YOU");
        		 System.out.println("Would you like to do delivery? Respond for yes: 1 or no: 0 >>");
        		 int deliveryDecision = in.nextInt();
        		 
        		 if(deliveryDecision == 1 && tempOrderSum < deliveryThreshold ) {
        			 System.out.println("There will be a delivery fee of " + deliveryFee + CURRENCY);
        			 float grandTotal = tempOrderSum + deliveryFee; 
        			 System.out.printf("Your grand total will be: " + grandTotal + CURRENCY);
        		 } else if (deliveryDecision == 1 && tempOrderSum > deliveryThreshold) {
        			 System.out.printf("Your grand total will be: " + tempOrderSum + CURRENCY);
        		 } else if(deliveryDecision == 0){
        			 System.out.println("You are welcome to pick up the pizza in store");
        			 System.out.printf("Your grand total will be: " + tempOrderSum + CURRENCY);
        		 } else if(deliveryDecision !=1 || deliveryDecision !=0 ){
        			 System.out.println("Invalid Response");
        		 }
        		 
        		 break; 
        	 };
        	 if(approval !=1) {
        		 System.out.println("Invalid response. Continue ordering?");
        		tries++;
        	 }
         } 
        
      }
   }
        
}

