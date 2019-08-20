import java.util.*;
class palin
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
if(rev!=n)
System.out.print("Not ");
System.out.print("Palindrome ");

}
}