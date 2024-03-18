class $09_static6
{
	static int result;
	public static void main(String[] args)
	{
		result = demo.a + demo2.b;
		System.out.println(result);
	}
}

class demo
{
	static int a = 10;
}

class demo2
{
	static int b = 20;
}
