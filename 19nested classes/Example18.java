class Outer
{
	int a = 100;

	static class Inner
	{
		void m1()
		{
			System.out.println(a);
		}
	}
}
class Example18
{
	public static void main(String[] args)
	{
		Outer.Inner i = new Outer.Inner();
	}
}