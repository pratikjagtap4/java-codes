class Example16
{
	public static void main(String[] args)
	{
		String s1 = "Pratik";
		char ch = s1.charAt(3);
		System.out.println(ch);
		System.out.println("------");

		String str2 =  "Swapnil";
		int index = str2.indexOf("apn");
		System.out.println(index);
		System.out.println("-----");

		String str3 = "Pratikshahaha";
		int lastIndex = str3.lastIndexOf("ha");
		System.out.println(lastIndex);
		System.out.println("-------");

		String str4 = "jatap";
		boolean contain = str4.contains("ap");
		System.out.println(contain);


	}
}