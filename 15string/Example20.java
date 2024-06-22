class Example20
{
	public static void main(String[] args)
	{
		String fileName = "myResume.doc";
		int dotIndex = fileName.indexOf(".");

		String extension = fileName.substring(dotIndex);
		System.out.println(extension);
	}
}