/**
			 * Purpose of the program is to show case the use of printf
			 * @author Jose Mendoza
			 * @version 1.0
			 */
			
public class ClassExercise {
	
	/**
	 * Main method
	 * @param args default peramaters for main 
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			char test = 'b';
			
			double pi = 3.14;
			
			double distance = 9.3E+10;
			
			double money = 5.30;
			
			//with strings
		
			System.out.printf("%s and %s","Hello","Welcome to java");
			
			System.out.println("");
			
			//with characters
			
			System.out.printf("The second letter in the alphabet is %c", test);

			System.out.println("");
			
			//with decamals 
			
			System.out.printf("The value of pi is", pi);
			
			System.out.println("");
			
			//with exponential floating-point number

			System.out.printf("The distance between the earth and the sun is %e", distance);
			
			System.out.println("");
			
			//floating number
			
			System.out.printf("The amount of money I have is $%8.2f", money);
			
		
		}

	}


