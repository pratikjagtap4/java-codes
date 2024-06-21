abstract class Demo
{
	Demo(int a )
	{
		System.out.println("Hello this abstract class constructor");
	}
}

class Example10 extends Demo
{
	Example10()
		{
			super(10);
		}

	public static void main(String[] args)
	{
		new Example10();
	}
}