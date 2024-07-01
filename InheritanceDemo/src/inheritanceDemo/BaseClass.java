package inheritanceDemo;

public class BaseClass extends SuperBaseClass {
	private int value;
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "BaseClass[value=" + value + "]";
	}
}
