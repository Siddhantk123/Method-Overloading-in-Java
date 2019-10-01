# Method-Overloading-in-Java
class OverloadDemo{
	void shape()
{
System.out.println("No Parameters");
}
	void shape(int a,int b)
{
if(a==b)
{
System.out.println("Area of square is: "+(a*a));
}
else{
System.out.println("Area of rectangle is: "+(a*b));
}
}
	void shape(int a,int b,int c)
{
System.out.println("Area of cuboid is : "+(a*b*c) );
}
	double shape(double a)
{
System.out.println("double a: "+a);
return a*a;
}
}
class Overload{
	public static void main(String args[]){
		OverloadDemo ob=new OverloadDemo();
		double result;
		ob.shape();
ob.shape(5,2);
ob.shape(4,4);
ob.shape(5,2,3);
		result=ob.shape(20.14);
		System.out.println("Result of ob.test(20.14): "+result);
	}
}
