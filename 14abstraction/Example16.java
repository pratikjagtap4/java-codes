abstract class Demo
{
	static 
	{
		System.out.println("Static block of Demo class");
	}
}


class Example16 extends Demo
{
	public static void main(String[] args)
	{
		new Example16();
	}
}