abstract class Outer 
{
	abstract void m1();

	static class Inner extends Outer
	{
		void m1()
		{
			System.out.println("inside m1");
		}
	}
}
class Example24
{
	public static void main(String[] args)
	{
		Outer.Inner i = new Outer.Inner();
		i.m1();

	}
}