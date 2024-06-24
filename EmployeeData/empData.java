
public class empData {

	public String ename;
	
	public void setName(String name)
	{
		ename = name;
	}
	
	public void getName()
	{
		System.out.println(ename);
	}
	
	public static void main(String[] args) {
		empData ed = new empData();
		
		ed.setName("Khushi");
		ed.getName();
	}

}
