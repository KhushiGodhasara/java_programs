package lambdaEx;

public class LambdaWithoutParameter {

	interface IStatement {
	    String show();
	}
	
	public static void main(String[] args) {
		
		IStatement s = () -> {return "Hello World!";};
		System.out.println(s.show());
		
		}

}
