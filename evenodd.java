import java.util.*;
class evenodd
{public static void main(String args[])
{Scanner obj = new Scanner(System.in);
System.out.println("Enter number");
String s[]={"even","odd"};
int n = obj.nextInt();
System.out.println("number is " + s[n%2]);
}
}
