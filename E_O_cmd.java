class E_O
{
public static void main(String args[])
{
int x;
String s[] = {"Even","Odd"};
x = Integer.parseInt(args[0]);

System.out.println("Number is " + s[x%2]);
}
}