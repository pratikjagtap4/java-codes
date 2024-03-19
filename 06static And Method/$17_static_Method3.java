class $17_static_Method3
{
	public static void main(String[] args)
	{
		int a = 100;
		System.out.println("value of a inside main" + a);

		m1(a);
	}
	static void m1(int b)
	{
		System.out.println("value of a inside m1" + b);
	}
}