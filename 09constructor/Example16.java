class Example16
{
	Example16()
	{
		this(10);
		System.out.println("inside 0 arg");
	}
	Example16(int a)
	{
		this(); // constructors can not be called recurssively
		System.out.println("inside 1 arg");
	}
	public static void main(String[]  args)
	{
		Example16 obj = new Example16();
	}
}