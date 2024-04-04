class Example05
{
	{
		System.out.println("inside instance block");
	}
	Example05()
	{
		System.out.println("inside 0 arg constructor ");
	}
	Example05(int a )
	{
		System.out.println("inside 1 args constructor");
	}
	public static void main(String [] args)
	{
		Example05 obj = new Example05();
		Example05 obj2 = new Example05(10);
	}
}