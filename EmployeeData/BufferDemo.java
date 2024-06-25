import java.io.*;

public class BufferDemo {

	public static void main(String[] args) {
		String name;
		int sal;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter Name : ");
			name = br.readLine();
			
			System.out.println("Enter Salary : ");
			sal = Integer.parseInt(br.readLine());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
