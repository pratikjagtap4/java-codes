abstract class Demo
{
	{
		System.out.println("Demo class instance block");
	}

	Demo()
	{
		System.out.println("Demo class Constructor");
	}
}


class Example14 extends Demo
{
	{
		System.out.println("Ex14 class instance block");
	}

	Example14()
	{
		System.out.println("ex14 class constructor");
	}

	public static void main(String[] args)
	{
		new Example14();
	}
}