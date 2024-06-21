interface Demo
{
	void m1();
}
class Example17 implements Demo
{
	public void m1()
	{
		System.out.println("overriden m1");
	}

	public static void main(String[] args)
	{
		new Example17().m1();
	}
}