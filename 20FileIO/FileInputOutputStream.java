import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class FileInputOutputStream
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileInputStream fis = new FileInputStream("C:\\fullstack\\Core Java\\20FileIO\\source.txt");
		FileOutputStream fos = new FileOutputStream("C:\\fullstack\\Core Java\\20FileIO\\destination.txt");

		int info;

		while((info=fis.read())!=-1)
		{
			System.out.print((char)info);
		}
	}
}