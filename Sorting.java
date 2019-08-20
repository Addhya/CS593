import java.util.*;
class Sorting {
	void bubble(int a[])
	{
		for( int i = a.length-1;i>0;i--)
			{for(int j = 0; j<i;j++)
			{if(a[j]>a[j+1])
			{
				a[j] = a[j]+a[j+1];
				a[j+1] = a[j] - a[j+1];
				a[j] = a[j] - a[j+1];
			}}}
}	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Sorting obj = new Sorting ();
 
		System.out.println("Enter number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements");
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		obj.bubble(a);
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
				
	}
}
	