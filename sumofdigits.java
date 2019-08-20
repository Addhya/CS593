import java.util.*;
class sum
{public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int n = sc.nextInt();
int sum= 0, t = n;
while(t>0)
{
sum+= t%10;
t /= 10;
}

System.out.print("Sum of Digits = " + sum);

}
}