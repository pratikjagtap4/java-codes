interface Outer
{
	void m1();
}

class Example25
{
	Outer o = new Outer()
	{
		public void m1()
		{
			System.out.println("Inside Anonymous inner class");
		}
	};

	public static void main(String[] args)
	{
		Example25 obj = new Example25();
		obj.o.m1();	
	}
}