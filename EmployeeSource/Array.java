package EmployeeSource;

import java.util.ArrayList;

class Initial {
	protected ArrayList<String[]> values() {
		ArrayList<String[]> Employee_Db = new ArrayList<String[]>(100);
		String Employee1[] = { "1122", "Sakthi", "25", "trainee", "Java", "25000" };
		String Employee2[] = { "1123", "Sana", "25", "Senior SE", "Selenium", "35000" };
		Employee_Db.add(Employee1);
		Employee_Db.add(Employee1);
		return Employee_Db;
	}
}
