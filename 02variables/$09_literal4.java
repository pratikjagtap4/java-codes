class $09_literal4
{
	public static void main(String[] args)
	{
		long a = 2147483647;
		System.out.println(a);
		
		// by default integral lietarls are consider as a int data type , but since range of int is only upto 2147483647 and any value above that is consider s too large number 

		long b = 2147483648L;
		System.out.println(b);
	
		long c = 2147483648l;
		System.out.println(c);
	

	}
}