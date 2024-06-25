import java.util.Scanner;

public class EmployeeData {

	private String Name, Designation;
	private int BasicSalary;
	
	public EmployeeData()
	{
		Name = "DEFAULT";
		Designation = "DEFAULT";
		BasicSalary = 00;
	}
	
	public EmployeeData(String nm, String desg,int sal )
	{
		Name = nm;
		Designation = desg;
		BasicSalary = sal;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getDesignation()
	{
		return Designation;
	}
	
	public void setDesignation(String Designation)
	{
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
		EmployeeData e1 = new EmployeeData();
		EmployeeData e2 = new EmployeeData("Ridham","CEO",50000);
		System.out.println(e1);
		System.out.println(e2);
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter name: ");
			String Name = sc.next();
			
			System.out.println("Enter designation: ");
			String Designation = sc.next();
			
			System.out.println("Enter Salary: ");
			int Salary = sc.nextInt();
			
			e1.setName(Name);
			e1.setDesignation(Designation);
			e1.setBasicSalary(Salary);
		}
		
		System.out.println(e1);
	}

}
