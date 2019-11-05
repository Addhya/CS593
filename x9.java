class X{
	int a=10;
	void show(){
	int a=100;
	System.out.println(a);
	System.out.println(this.a);
}
	public static void main(String args[]){
		x ob=new x();
		ob.show();
}
}