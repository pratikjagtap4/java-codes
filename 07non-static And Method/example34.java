class demo1
{
	float m1(int a , float b)
	{
		return a+b;
	}
}

class demo2
{
	static float m2(int a , float b)
	{
		return a + b + 200.f;
	}
}



class example34
{
	public static void main(String[] args)
	{
		int a = 10;
		float b = 20.5f;

		demo1 obj = new demo1();

		float x = obj.m1(a,b);
		float y = demo2.m2(a,b);

		System.out.println( x + " " + y);
		
	}
}