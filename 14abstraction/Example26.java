class Sample
{	
	interface Demo
	{
		void m1();
	}
}
class Example26 implements Sample.Demo
{
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args)
	{
		new Example26().m1();
	}
}