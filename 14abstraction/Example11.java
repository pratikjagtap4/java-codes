abstract class Demo
{
	Demo(int a)
	{
		this();
		System.out.println(" 1 arg constructor");
	}

	Demo()
	{
		System.out.println(" 0 arg constructor");
	}
}

class Example11 extends Demo
{
	Example11()
	{
		super(10);
		System.out.println("0 args child constr");
	}

	public static void main(String[] args)
	{
		new Example11();
	}
}