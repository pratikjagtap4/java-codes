interface Demo
{
	interface Sample
	{
		void m1();
	}
}


class Example25 implements Demo.Sample
{
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args)
	{

		new Example25().m1();
	}
}