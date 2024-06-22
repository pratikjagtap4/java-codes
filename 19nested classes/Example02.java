class Outer 
{
	int a = 100;
	class Inner
	{
		float b = 200.5f;
	}
}
class Example02
{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		System.out.println(o.a);

		Outer.Inner i =o.new Inner();
		System.out.println(i.b);

	}
}