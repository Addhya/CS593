interface Foo
{
	void display();
}
class Bar implements Foo
{
	public void display()
	{
		System.out.println("Works!");
	}
}
public class Test1
{
	public static void main(String[] args)
	{
		Bar obj = new Bar();
		obj.display();
	}
}