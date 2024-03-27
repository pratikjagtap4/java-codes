class example51
{
	int a; 
	 void m1(int a )
	{
		 this.a = a;
	}

	public static void main(String[] args)
	{
		example51 obj1 = new example51();
		example51 obj2 = new example51();

		obj1.m1(10);
		obj2.m1(20);

		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
