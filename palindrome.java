import java.util.*;
class palindrome
{public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number");
int n = sc.nextInt();
String s = String.valueOf(n);
for(int i = 0; i<=s.length()/2 ; i++)
{if(s.charAt(i)!=s.charAt(s.length()-1-i))
System.out.print("Not ");
}
System.out.println("Palindrome");
}
}