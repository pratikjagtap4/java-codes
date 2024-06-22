class Outer
{
	int a = 10;

	class Inner
	{
		float b = 20.5f;
		void m1()
		{
			System.out.println(a+b);
		}
	}
}
class Example03
{
	public static void main(String[] args)
	{
		new Outer().new Inner().m1();
	}
}