import java.util.Scanner;

class Count
{
	int nscount;
	static int scount;
	Count(){
		this.nscount = 0;
	}
}

public class CountTest
{
	public static void main(String[] args)
	{
	Count o1 = new Count();
	Count o2 = new Count();

	System.out.println("Non static value of 1st obj : "+o1.nscount);
	System.out.println("Static value of 1st obj : "+o1.scount);

	System.out.println("Non static value of 2nd obj : "+o2.nscount);
	System.out.println("Static value of 2nd obj : "+o2.scount);

	System.out.println("Now Incrementing o1");

	o1.nscount++;
	o1.scount++;

	System.out.println("Non static value of 1st obj : "+o1.nscount);
	System.out.println("Static value of 1st obj : "+o1.scount);
	
	System.out.println("Non static value of 2nd obj : "+o2.nscount);
	System.out.println("Static value of 2nd obj : "+o2.scount);
	}
}