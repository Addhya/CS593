abstract class A
{
	void show()
	{
		System.out.println("Abstract class");
	}
}

public class AbstractTest extends A
{
	public static void main(String[] args)
	{
		AbstractTest obj = new AbstractTest();
		obj.show();
	}
}			