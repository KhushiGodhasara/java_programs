package Familydetails;
import java.util.*;


public class DirectoryDemo {

	public static void main(String[] args) {
		Map<String, Person> directory = new HashMap<String, Person>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Create a database entry: ");
			System.out.println("2.Edit ane entry: ");
			System.out.println("3.Exit: ");
			System.out.println("Choose any option: ");
			
			int ch = sc.nextInt();
			
			switch(ch){
				case 1:
					createEntry(sc, directory);
					break;

				case 2:
					editEntry(sc, directory);//add argument to match editEntry map<String,Person>directory
					break;
					
				case 3:
					System.exit(0);
					
				default:
					System.out.println("Invalid Choice");
			}
		}

	}
	
	private static void createEntry(Scanner sc, Map<String, Person> directory)
	{
		System.out.println("Enter Unique ID: ");
		String uniqueID = sc.next();
		if(directory.containsKey(uniqueID))
		{
			System.out.println("This unique id already exists.");
		}
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Address: ");
		String address = sc.next();
		
		System.out.println("Enter Telephone Number (with STD code): ");
		String telephoneNumber = sc.next();
		
		System.out.println("Enter MobineNumber: ");
		String mobileNumber = sc.next();
		
		System.out.println("Enter Head of Family: ");
		String headOfFamily = sc.next();
		
		Person p = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
		directory.put(uniqueID, p);
		System.out.println(p);
		
		System.out.println("Created Successfully.");
	}
	
	private static void editEntry(Scanner sc, Map<String, Person> directory)
	{
		System.out.println("Enter UniqueID: ");
		String uniqueID = sc.next();
		Person p = directory.get(uniqueID);
		
		
		if(p==null)
		{
			System.out.println("This unique Id does not exist.");
			return;
		}
		
		System.out.println("Enter new Name: ");
		String name = sc.next();
        if (!name.isEmpty()) {
            p.setName(name);
        }
        
        System.out.print("Enter new Address: ");
        String address = sc.next();
        if (!address.isEmpty()) {
            p.setAddress(address);
        }

        System.out.print("Enter new Telephone Number (with STD code): ");
        String telephoneNumber = sc.next();
        if (!telephoneNumber.isEmpty()) {
            p.setTelephoneNumber(telephoneNumber);
        }

        System.out.print("Enter new Mobile Number: ");
        String mobileNumber = sc.next();
        if (!mobileNumber.isEmpty()) {
            p.setMobileNumber(mobileNumber);
        }

        System.out.print("Enter new Head of Family: ");
        String headOfFamily = sc.next();
        if (!headOfFamily.isEmpty()) {
            p.setHeadOfFamily(headOfFamily);
        }
        
        System.out.println(p);
        System.out.println("Entry updated successfully.");
	}

}
