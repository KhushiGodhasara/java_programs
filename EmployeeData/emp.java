
public class emp {

	private String Name, Designation;
	private int BasicSalary;
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}
	public int getBasicSalary() {
		return BasicSalary;
	}
	public void setBasicSalary(int BasicSalary) {
		this.BasicSalary = BasicSalary;
	}
	
	@Override
	public String toString()
	{
		return "EmployeeData [Name = " + Name + ", Designation = " + Designation + ", BasicSalary = " + BasicSalary +"]";
	}
	
	public static void main(String[] args) {
		emp e = new emp();
		e.setName("Khushi");
		System.out.println(e);
	}

}
