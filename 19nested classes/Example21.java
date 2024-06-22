class Outer
{
	int a = 100;
	static int b = 200;

	static class Inner
	{
		static void m1()
		{
			Outer o = new Outer();
			System.out.println(o.a + b);
		}
	}
}
class Example21
{
	public static void main(String[] args)
	{
		Outer.Inner.m1();
	}
}