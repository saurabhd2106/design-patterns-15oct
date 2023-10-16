package adapterExample;

public class EmployeeObjectAdapter implements Customer {

	Employee employee;

	public EmployeeObjectAdapter(Employee employee) {

		this.employee = employee;

	}

	@Override
	public String getName() {

		return employee.getFullName();
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return employee.getJobTitle();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return employee.getOfficeLocation();
	}

}
