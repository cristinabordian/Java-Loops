
public class Exercise123456789 {

	public static void main(String[] args) {
		
	//A	// 
		//1 2 3   
		//4 5 6  
		//7 8 9 
	
	//B	// 
		//1 
		//2 3 
		//4 5 6
		//7 8 9 10
		
		
		int n = 1;
	    while( n <= 9 && false) {
	    	System.out.print(n + " "); 
	    	if ( n % 3 == 0 ) {
				System.out.println(" "); 
			}
	        n++; 
	    }
	    
	   
	    
	    while ( n <= 10) {
	    	System.out.print(n + " "); 
	    	if (n == 1 || n == 3 || n == 6) {
	    		System.out.println( " "); 
	    }
	    	
	    	n++; 
	    }
	    
	    
	    
	    
	    
	    

	}

}
