import java.util.*;
class matmul
{
public static void main(String args[])
{
int sum;
Scanner sc = new Scanner(System.in);
System.out.println("Enter MxN for 1st matrix");
int a[][] = new int[sc.nextInt()][sc.nextInt()];
System.out.println("Enter MxN for 2nd matrix");
int b[][] = new int[sc.nextInt()][sc.nextInt()];
int c[][] = new int[b[0].length][a.length];
if(b[0].length == a.length)
System.exit(0);
for (int i = 0;i<a[0].length;i++)
{sum = 0;
for(int j = 0, k = i; j < b.length; j++,k++) 
sum+=a[i][j]*b[j][i];
c[i][
}
}