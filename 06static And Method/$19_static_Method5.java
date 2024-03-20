class $19_static_Method5
{

	static float a = 200.5f;

	static float m1(int b)
	{
		float result = b + a;

		return result;
	}

	public static void main(String[] args)
	{
		int b = 100; 
		float result = m1( b);

		System.out.println(result);
	}
}
