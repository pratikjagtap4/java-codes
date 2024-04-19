final class Demo
{
	void m1()
	{
		System.out.println("inside m1 method");
	}
}
 
class Sample extends Demo
{
	void m2()
	{
		System.out.println("inside m2 method");
	}
}

class Example09
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1();
		obj.m2();
	}
}