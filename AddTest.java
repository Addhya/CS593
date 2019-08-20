class Super
{
	static int b = 4;
}
class Base extends Super
{
	static int s = 5;
	public void add()
	{
		System.out.println("Sum : "+(this.b + this.s));
	}
}
class AddTest
{
	public static void main(String[] args)
	{
		Base obj = new Base();
		obj.add();
	}
}