interface Demo
{
	default void m1()
	{
		System.out.println("m1 Demo method");
	}
}

class Example30 implements Demo
{
	public void m1()
	{
		System.out.println("m2 Ex30 method");
	}

	public static void main(String[] args)
	{
		Example30 obj = new Example30();
		obj.m1();
	}
}