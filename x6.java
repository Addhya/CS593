class x5{
	void  abc(int a,int b){
		int z;
		
		z=a+b;
		
		System.out.println(z);
	}
	void abc(double a,double b){
		double x;
		x=a+b;
		
		System.out.println(x);
}
}
class x6{
	public static void main(String args[]){
		x5 ob =new x5();
		ob.abc(9,9);
		
		ob.abc(8.0,8.1);
		
		

}
}