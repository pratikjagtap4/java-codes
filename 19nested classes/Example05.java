class Outer 
{
	int a = 10;
	void m1()
	{
		Inner i = new Inner();
		System.out.println(a + i.b);
	}
	class Inner
	{
		float b = 10.5f;
	}
}
class Example05
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();
	}
}
