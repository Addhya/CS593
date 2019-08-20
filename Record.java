import java.util.*;
class Record
{
	int Roll;
	double chem;
	double maths;


	void ini(double p, double m, double c)
	{
		if(p<0 || p>100 ||m<0 || m>100 ||c<0 || c>100 )
		{	System.out.println("error");
			System.exit(0);
		}
		phy = p;
		maths = m;
		chem = c;
	}
	double total()
	{
		return phy+maths+chem;
	}
}
class marks
	{public static void main(String args[])
		{
		Scanner sc = new Scanner(System.in);
		Record obj = new Record();
		System.out.println("Enter phy,maths and chem marks respectively");
		obj.ini(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		
		System.out.println("Total = " + obj.total());
		System.out.println("Average = " + (float)obj.total()/3);
}
}
