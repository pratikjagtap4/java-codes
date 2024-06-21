class Example14
{
	public static void main(String[] args)
	{
		String str1 = "pratik";
		String str2 = "PRATIK";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}