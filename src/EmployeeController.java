
public class EmployeeController {
	private Employee model;
	private EmployeeView view;
	
	public EmployeeController (Employee model, EmployeeView view ) {
		this.model = model;
		this.view = view;
	}
	
	public void setEmployeeName(String name) {
		model.setName(name);
	}
	
	public String getEmployeeName() {
		return model.getName();
	}
	
	public void setEmployeeRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	public String getEmployeeRollNo() {
		return model.getRollNo();
	}
	public void updateView() {
		view.printDetails(model.getName(), model.getRollNo());
	}

}
