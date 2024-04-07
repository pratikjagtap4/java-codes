class Example13
{
	{
		System.out.println("inside instance block");
	}
	Example13()
	{
		this(1);
		System.out.println("inside 0 arg constructor");
	}
	Example13(int a)
	{
		System.out.println("inside 1 args constructor");
	}
	public static void main(String[] args)
	{
		Example13 obj = new Example13();
	}
}
