interface Demo
{
	static void m1()
	{
		System.out.println("Static interface method");
	}
}
class Example32 implements Demo
{
	public static void main(String[] args)
	{
		Demo.m1();
	}
}