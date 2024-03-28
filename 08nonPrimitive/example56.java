class System1
{
	static System1 out1;
	void println(String str)
	{
		System.out.println(str);
	}
}
class example56
{
	public static void main(String[] args)
	{
		System1.out1 = new System1();

		System1.out1.println("hello this  sop simulation");
		System.out.println("this is sop statement");
	}
}