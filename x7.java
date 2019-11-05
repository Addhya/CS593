class area{
	
	area(int r){
	double x = 3.14*r*r;
	System.out.println("The area of circle is " + x);
}
	area(double  a){
	double m=a*a;
	System.out.println("The area of square is " + m);
}
	area(int h,double l){
	double n=0.5*h*l;
	System.out.println("The area of triangles is " + n);
}
	area(double a,double b){
	double q=a*b;
	System.out.println("The area of rectangle is " +q);
}
}
class x7{
	public static void main(String args[]){
		area ab=new area(5);
area ob=new area(9);
area xb=new area(6,6.0);
area zb=new area(7.8,8);
}
}