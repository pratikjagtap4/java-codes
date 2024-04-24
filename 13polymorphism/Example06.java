class Example06
{
	Example06(float a)
	{
		System.out.println("float arg");
	}
	Example06(int b)
	{
		System.out.println("int arg");
	}
	public static void main(String[] args)
	{
		Example06 obj = new Example06(10.5f);
	}
}