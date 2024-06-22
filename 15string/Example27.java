import java.util.StringTokenizer;
class Example27
{
	public static void main(String [] args)
	{
		StringTokenizer str1 = new StringTokenizer("Hello this is example of String Tokenizer");
		
		while(str1.hasMoreElements())
		{
			System.out.println(str1.nextElement());
		}
	}
}