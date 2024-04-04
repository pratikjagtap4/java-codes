class Example03
{
	{
		System.out.println("inside instance block - 1");
	}
	{
		System.out.println("inside instance block-2");
	}
	public static void main(String[] args)
	{
		Example03 obj = new Example03();
	}
}