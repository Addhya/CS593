import java.util.*;
class rev
{public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int n = sc.nextInt();
int rev = 0, t = n;
while(t>0)
{
rev = rev * 10 + t%10;
t /= 10;
}
System.out.println("Rev of number " + n + " = " + rev);
}
}