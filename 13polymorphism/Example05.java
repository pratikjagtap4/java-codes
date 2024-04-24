class Example05
{
	Example05()
	{
		System.out.println("0 arg");
	}
	Example05(int a)
	{
		System.out.println("1 arg");
	}
	public static void main(String[] args)
	{
		Example05 obj = new Example05(10);
	}
}