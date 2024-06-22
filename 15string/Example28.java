
import java.util.StringTokenizer;
class Example28
{
	public static void main(String[] args)
	{
		String str1 = "Hello-this-is-example-of-String-Tokenizer";
		StringTokenizer st = new StringTokenizer(str1 , "-");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}
}