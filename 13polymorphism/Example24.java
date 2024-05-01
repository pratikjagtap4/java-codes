class Demo
{
	void m1()
	{
		System.out.println("garndparent method");
	}
}

class Sample extends Demo
{
	void m2()
	{
		System.out.println("parent method");
	}
}

class Success extends Sample
{
	void m3()
	{
		System.out.println("child method");
	}
}

class Example24
{
	public static void main(String[] args)
	{
		Sample obj = new Success(); // behaving as parent
		obj.m1();
		obj.m2();
		//obj.m3(); compile error

		System.out.println("--------------");

		Demo d = (Demo) obj; // behaving as grandparent only

		d.m1();
		//d.m2(); compile error 
		//d.m3();

		System.out.println("---------------");

		Success s = (Success) obj; // behaving as child

		s.m1();
		s.m2();
		s.m3();

		System.out.println("---------------");

		d.m1();
		obj.m1();
		obj.m2();


	}
}