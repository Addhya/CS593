class Super
{
	public void d1()
	{
		System.out.println("Super class");
	}
}
class Base extends Super
{
	public void d2()
	{
		System.out.println("Base class");
	}
}
class InheritanceTest
{
	public static void main(String[] args)
	{
		Base obj = new Base();
		obj.d1();
	}
}