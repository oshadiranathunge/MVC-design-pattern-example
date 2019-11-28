
public class EmployeeDemo {
	public static void main(String[] args) {
		
		Employee model = retrieveEmployeeFromDatabase();
		
		EmployeeView view = new EmployeeView();
		EmployeeController controller = new EmployeeController(model, view);
		controller.updateView();
		
		System.out.println("");
		controller.setEmployeeName("John");
		controller.updateView();
	}
	
	private static Employee retrieveEmployeeFromDatabase() {
		
		Employee employee = new Employee();
		employee.setName("Jame");
		employee.setRollNo("354");
		return employee;
	}

}
