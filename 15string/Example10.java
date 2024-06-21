class Example10
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Pratik");
		System.out.println(sb1);
		System.out.println("--------");
		
		String str1 = new String(sb1);
		System.out.println(str1);
		System.out.println("--------");

		String str2 =  sb1.toString();
		System.out.println(str2);
	}
}
