class Example02
{
	Example02()
	{
		System.out.println("inside constructor");
	}
	public static void main(String[] args)
	{
		new Example02();
		new Example02();
		new Example02();
	}
}