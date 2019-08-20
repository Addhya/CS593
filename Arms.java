import java.util.*;
class Arms{
	int lengthOfNumber(int n){
		int c = 0;
		while(n>0){
			n/=10;
			c++;
		}
		return c;
	}
	int power(int b, int p){
		int result=1;
		while(p>0){	
			p--;
			result *= b;
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Arms obj = new Arms();
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = 0,t = n;
		while(t>0){
			sum += obj.power(t%10, obj.lengthOfNumber(n));
			t /= 10;
		}
		if(sum != n)
			System.out.print("Not ");
		System.out.println("Armstrong!");
	}
}
