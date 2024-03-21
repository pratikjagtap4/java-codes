class sample
{
	int a = 100;
	void m1()
	{
		System.out.println("Inside m1");
	}
}
class $06_nonStatic
{
	public static void main(String[] args)
	{
		// directly
		//System.out.println(a);
		//m1();

		// using classname
		//System.out.println(sample.a);
		//sample.m1();
		

		// using object
		sample s1 =new sample();
		System.out.println(s1.a);
		s1.m1();

	}
	
}