class Example08
{
	static int a=1;


	{
		a = 10;
		System.out.println("inside instance block " + a);
	}
	
	Example08(int a)
	{
		System.out.println("inside constructor" + this.a);
		this.a = a;
		System.out.println("inside constructor " + this.a);
	}

	public static void main(String[] args)
	{
		Example08 obj = new Example08(100);
	}

}