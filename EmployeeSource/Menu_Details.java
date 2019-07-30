package EmployeeSource;
import java.util.Scanner;
//create the class for the menu to run the Employee management program with main method
public class Menu_Details {
//It is main method calling the login function by create the object for the Login class
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		System.out.println("EMPLOYEE RECORDS");
		Login.login();
	}
}