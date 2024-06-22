class Outer
{
	 int a = 10;
	 float b =20.5f;

	class Inner
	{
		int a = 100;
		float b = 200.5f;

		void m1(int a , float b)
		{
			System.out.println(a+b);
			System.out.println(this);
			System.out.println(this.a + this.b);
			System.out.println(Outer.this);
			System.out.println(Outer.this.a + Outer.this.b);
		}
	}
}
class Example09
{
	public static void main(String[] args)
	{
		new Outer().new Inner().m1(1000 , 2000.5f);
	}
}