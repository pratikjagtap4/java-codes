class Example15
{
	Example15()
	{
		System.out.println("inside 0 args");
		this(10); // this statement must be the first statement use in constructor
	}
	Example15(int a)
	{
		System.out.println("inside 1 args");
	}
	public static void main(String [] args)
	{
		Example15 obj = new Example15();
	}
}