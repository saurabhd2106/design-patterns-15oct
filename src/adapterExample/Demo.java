package adapterExample;

public class Demo {

	public static void main(String[] args) {

		EmployeeClassAdapter adapter = new EmployeeClassAdapter();

		populateEmployeeData(adapter);

		BusinessCardDesigner cardDesigner = new BusinessCardDesigner();

		String cardDetails = cardDesigner.designCard(adapter);

		System.out.println(cardDetails);

	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}

}
