class Outer
{
	void m1()
	{
		Inner i = new Inner();
		System.out.println(i.a);
	}

	static class Inner
	{
		int a = 100;
	}
}
class Example20
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();
	}
}