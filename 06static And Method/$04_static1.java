class $04_static1
{
	static int var1 = 100;

	public static void main(String[] args)
	{
		// aproach 1 --> direct approach
		System.out.println(var1);

		// approach 2 --> using class name 
		System.out.println($04_static1.var1);

		// approach3 --> using object
		$04_static1 ref =new $04_static1();
		System.out.println(ref.var1);

	}
}