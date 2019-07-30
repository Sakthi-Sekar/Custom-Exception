package EmployeeSource;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Employee {
	Scanner sc = new Scanner(System.in);

	public void Search(ArrayList<String[]> employe) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println("Enter Employee id to find that person");
			String EmployeeName = sc.next();
			System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t   \tSalary");
			for (int initial1 = 0; initial1 < employe.size(); initial1++) {
				String[] TempEmp = employe.get(initial1);
/// check the employee name equals to user input name
				if (TempEmp[1].equals(EmployeeName)) {
					for (String str : TempEmp) {
						System.out.print(str + "    ");
					}
					System.out.println("");
				}
			}
		}
	}

	public void Search(ArrayList<String[]> employe, String Designation) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t   \tSalary");
			for (int initial1 = 0; initial1 < employe.size(); initial1++) {
				String[] TempEmp = employe.get(initial1);
				if (TempEmp[3].equals(Designation)) {
					for (String str : TempEmp) {
						System.out.printf(str + "\t\t");
					}
					System.out.println("");
				}
			}
		}
	}

}
