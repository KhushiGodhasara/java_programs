package employeedetail;

public class Demo {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.Name = "Khushi";
		e.Age = 22;
		e.PhoneNumber = 987654321 ;
		e.Address = "Junagadh";
		e.Salary = 40000 ;
		e.Specialization = "Web Developer";
		
		System.out.println("Employee Details : ");
		System.out.println("Name: " + e.Name);
		System.out.println("Age: " + e.Age);
		System.out.println("Phone Number: " + e.PhoneNumber);
		System.out.println("Address: " + e.Address);
		System.out.println("Specialization: " + e.Specialization);
		e.printSalary();
	}

}
