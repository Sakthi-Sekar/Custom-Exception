package EmployeeSource;
import java.util.Scanner;
public class Login 
{
	public static void login() 
	{
		Scanner scan = new Scanner(System.in);
		String user_name = "Sakthi";
		String pass_word = "sak123";
		System.out.println("Enter username");
		String user_name1 = scan.nextLine();
		System.out.println("Enter password");
		String pass_word1 = scan.nextLine();
		if (user_name.equals("Sakthi") && pass_word.equals("sak123")) {
			System.out.println("Logged in successfully");
			Menu emp = new Menu();
			try {
				emp.Menu();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Username or password is Incorrect type valid username or password");
			login();
		}
	}
}