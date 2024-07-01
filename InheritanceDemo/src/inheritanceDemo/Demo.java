package inheritanceDemo;

public class Demo {

	public static void main(String[] args) {
		// SuperBaseClass s1 = new SuperBaseClass();
		BaseClass b1 = new BaseClass();
		b1.intro();
		b1.setValue(10);

		System.out.println(b1);
	}

}
