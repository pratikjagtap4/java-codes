class Demo
{
	int a = 10;
	float b = 20.5f;
}

class Sample extends Demo
{
	int a = 100;
	float b = 200.5f;

	void m1( int a , float b)
	{
		System.out.println( a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);
	}
}

class Example12
{
	public static void main(String[] args)
	{
		Sample obj = new Sample();
		obj.m1(1000 , 2000.5f);
	}
}