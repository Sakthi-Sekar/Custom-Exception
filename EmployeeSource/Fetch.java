package EmployeeSource;

import java.util.ArrayList;

public class Fetch extends Create {
	public Fetch(ArrayList<String[]> employe) {
		if (employe.isEmpty()) {
			System.out.println("Employee database is empty");
		} else {
			System.out.println("Enter the Employee id to find the Employee");
			int Emp_id = sc.nextInt();
			System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t  \tSalary");
			for (int initial1 = 0; initial1 < employe.size(); initial1++) {
				String[] TempEmp = employe.get(initial1);
				if (TempEmp[0].equals(Integer.toString(Emp_id))) {

					for (String str : TempEmp) {
						System.out.printf(str + "\t\t");
					}
					System.out.println();
				}

			}
		}
	}

}