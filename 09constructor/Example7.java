class sample
{
	sample()
	{
		System.out.println("inside sample constructor");
	}
}

class sample2
{
	sample2()
	{
		System.out.println("inside sample2 constructor");
	}
}

class Example7
{
	Example7()
	{
		System.out.println("inside Example7 constructor");
	}

	public static void main (String[] args)
	{
		Example7 obj1 = new Example7();
		sample s1 = new sample();
		sample2 s2= new sample2();
	}
}