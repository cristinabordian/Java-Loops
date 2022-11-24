
public class BrainFfForApp {

	public static void main(String[] args) {
	   
	    int a=1,b=1, c=1;
		
			for( b=a++; c<++b; a=c+=2 ) {
					System.out.printf("%d %d %d\n",--a,--b, c);
			}

	}

}
// Java For Loop
// for (initialExpression; testExpression; updateExpression) {
//         //body of the loop
//       }

// initialExpression - initializes or declares variables, executes only once
// testExpression - the condition is evaluated. If true - the body of the loop is executed
// updateExpression updates the value of initialExpression
// The condition is evaluated again. The process continues until the condition is false.

// 1. Pas_1. Se declara b=a++ -> b=1+1=2
// 2. Pas_2 Se verifica conditia c < b +1 -> c < 2 + 1 -> c < 3 - true
// 3. Pas_3. Se executa for loop boody  --a (2-1); --b (2-1); 
// 4. Pas_4. Se vace update la val a = c+=2 -> a = 1+2 -> a=3
// 5. System out  -> 1; 1; 1
// 6. Condition is evaluated again. 


