package adapterExample;

public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {

		return getFullName();
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return getJobTitle();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return getOfficeLocation();
	}

}
