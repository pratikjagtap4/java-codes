interface Demo
{
	default void m1()
	{
		System.out.println("complete method");
	}
}


class Example29 implements Demo
{
	public static void main(String[] args)
	{
		Example29 obj = new Example29();
		obj.m1();
	}
}