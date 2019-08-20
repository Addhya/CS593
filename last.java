class Room
{
	double l;
	double b;

	void ini(double l, double b)
	{
		this.l = l;
		this.b = b;
	}
	double area()
	{
		return l*b;
	}
}
class RoomArea
	{public static void main(String args[])
		{
		Room obj = new Room();
		obj.ini(10,20);

		System.out.println("Area = " + obj.area());
}
}
