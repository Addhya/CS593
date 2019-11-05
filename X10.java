class X10{
	int a=10;
	void show(){
	int a=100;
	System.out.println(a);
	System.out.println(this.a);
}
	public static void main(String args[]){
		X10 ob=new X10();
		ob.show();
}
}