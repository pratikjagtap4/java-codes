class Example08
{
	Example08(byte b)
	{
		System.out.println("byte arg");
	}
	Example08(short a)
	{
		System.out.println("short arg");
	}
	Example08(long a)
	{
		System.out.println("int arg");
	}
	public static void main(String[] args)
	{
		Example08 obj = new Example08(10);
	}
}