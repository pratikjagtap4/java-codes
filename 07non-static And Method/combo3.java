class combo3
{
    int a = 100;
	void m1()
	{
		System.out.println("inside method m1");
	}

    public static void main(String[] args)
    {
        //directly
        // System.out.println(a);

        //classname 
        //System.out.println(combo3.a);

		//object
		combo3 obj = new combo3();
		System.out.println(obj.a);
		obj.m1();



    }
}