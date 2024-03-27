class Demo
{
	float f = 10.5f;
	void m1()
	{
		System.out.println(f);
	}
}

class sample
{
	Demo obj1;
}

class example46
{
	public static void main(String [] args)
	{
		sample s1 = new sample();

		s1.obj1 = new Demo();

		s1.obj1.m1();

	}

}