class Example03
{
	void m1(int a)
	{
		System.out.println("m1 - int arg");
	}

	void m1(float b)
	{
		System.out.println("m1- float arg");
	}

	void m1(char c , boolean f)
	{
		System.out.println("m1 - char , boolean arg");
	}

	public static void main(String[] args)
	{
		Example03 obj = new Example03();
		obj.m1('a' , true);
	}
}
