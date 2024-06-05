class Outer
{
	private int a = 10;
	private float b = 20.5f;

	class Inner
	{
		int x = 100;
		float y = 200.5f;

		void m1()
		{
			System.out.println(a + b);
			System.out.println( x  +y);
		}
	}
}
class Example7
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();

		i.m1();
	}
}
