class Demo
{
	int a = 10;
	float b = 20.5f;
}

class Sample extends Demo
{
	int p = 100;
	float q = 200.5f;
	
	void m1( int x , float y)
	{
		System.out.println(x + y);
		System.out.println(p + q);
		System.out.println(a + b);
	}
}

class Example11
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1(1000, 2000.5f);
	}
}