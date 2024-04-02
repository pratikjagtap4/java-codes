class Example19
{

	
	Example19(int a )
	{
		if(a>5)
		{
			this(a-1);
		}
		System.out.println("inside constructor" + a);
	}
	
	public static void main(String[] args)
	{
		Example19 obj = new Example19(10);
	}
}