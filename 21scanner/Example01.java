
import java.util.Scanner;

class Example01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner("This is a scanner class example");

		while(sc.hasNext());
		{
			System.out.println(sc.next());
		}

		int  mark = 82;
		switch(true)
		{
			case 90 > mark && mark >=80:
				System.out.println("Good");
		}
	}
}