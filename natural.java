import java.util.*;
class sum
{public static void main(String args[])
	{Scanner obj = new Scanner(System.in);
	System.out.println("Enter number");
	int a = obj.nextInt();
	int sum = 0;
	for(int i =1;i<=a;i++)
	sum = sum+i;
	System.out.println("sum = "+sum);
	}
}