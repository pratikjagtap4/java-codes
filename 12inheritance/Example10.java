class Demo
{
	void m1()
	{
		System.out.println("inside parent method");
	}
}
final class Sample extends Demo
{
	void m2()
	{
		System.out.println("inside child method");
	}
}
class Example10
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1();
		obj.m2();
	}
}