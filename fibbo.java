import java.util.*;
class Fibbo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Arms obj = new Arms();
		System.out.println("Enter number");
		int n = sc.nextInt();
		int a = 0,b =1;
		if(n < 0)
			System.out.println("Error!");
		else 
			if(n >= 1)
				System.out.print(a);
			if(n >= 2)
				System.out.print(" " + b);
			if(n > 2){
				n-=2;
				while(n>0){
					b += a;
					a = b - a;
					System.out.print(" " + b);
					n--;
				}
			}
	}
}
	