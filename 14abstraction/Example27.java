interface Demo
{
	int a = 100;
}

class Example27 implements Demo
{
	public static void main(String[] args)
	{
		Example27 obj = new Example27();
		System.out.println(obj.a);
		// a = 200;
	}
}