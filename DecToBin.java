import java.util.*;
class DecToBin{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int t = n;
		int bits = 0;
		while(t > 0){
			bits = (t%2  + bits) * 10;
			t = t/2;
		}
		bits/=10;
		System.out.println("binary = " + bits);
	}
}
	