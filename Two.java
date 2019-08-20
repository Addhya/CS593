class One
{
	int x;
	One(){
		this.x = 10;
	}
}
class Two extends One
{
	One get(){
		return this.One();
	}
	public static void main(String[] args)
	{	
		One obj = get();
		System.out.println("Value x : "+obj.x);
	}
}