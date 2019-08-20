public class Test2
{
	int x;
	public String toString(){
		return new String("Attribute x : "+this.x);
	}
	public static void main(String[] args)
	{
		Test2 obj = new Test2();
		obj.x = 5;
		System.out.println(obj);
	}
}