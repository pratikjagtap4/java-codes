class Example066
{
	public static void main(String[] args)
	{
		//StringBuffer sb1 = "Hello";

		StringBuffer sb1 = new StringBuffer("Cyber");
		StringBuffer sb2 = new StringBuffer("Success");
		StringBuffer sb3 = new StringBuffer("Cyber");

		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

		
		System.out.println(sb1 == sb2);
		System.out.println(sb2 == sb3);
		System.out.println(sb3 == sb1);

	}
}