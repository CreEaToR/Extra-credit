import java.util.Scanner;

public class Delimiters {


public static void main(String args[]){
	//import scanner
	Scanner input = new Scanner(System.in);
	input.useDelimiter(",|");
	//ask user to enter 10 numbers
	System.out.println("Enter 10 numbers");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	int num3 = input.nextInt();
	int num4 = input.nextInt();
	int num5 = input.nextInt();
	int num6 = input.nextInt();
	int num7 = input.nextInt();
	int num8 = input.nextInt();
	int num9 = input.nextInt();
	int num10 = input.nextInt();
	
	//hold average in a variable
	double avg = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/(10);
	//print it out
	System.out.println("Your average is:"+ "\t"+ avg);
	
	
	
	
	}	
	
}