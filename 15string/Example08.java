class Example08
{
	public static void main(String[] args)
	{
		String str1 = new String("Pratik");
		String str2 = new String("Jagtap");
		String str3 = new String("Pratik");
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));


		String s1 = "Pratik";
		String s2 = "Jagtap";
		String s3 = "Pratik";

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
	}
}