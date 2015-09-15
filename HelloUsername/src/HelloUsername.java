
	import java.util.Scanner;
	public class HelloUsername {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			String name;
			System.out.println("Enter your name");
			name = keyboard.next();
			
			String username;
			System.out.println("Enter your username");
			username = keyboard.next();
			
			String password;
			System.out.println("Enter your password");
			password = keyboard.next();
			
			System.out.println("Hello " + name + ", welcome to CSC200 class!");
			System.out.println("Your username is " + username);
			System.out.print("Your password is " + password);
			
		}
}
