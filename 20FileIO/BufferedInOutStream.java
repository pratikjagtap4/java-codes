import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class BufferedInOutStream
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileInputStream fis = new FileInputStream("C:\\fullstack\\Core Java\\20FileIO.\\BufferedInOut.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("C:\\fullstack\\Core Java\\20FileIO.\\BufferedInOutDestination.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);


		int info;

		while( (info = bis.read()) != -1)
		{
			System.out.println(" " + (char)info);
			bos.write(info);
		}
		bos.flush();
		fis.close();
		fos.close();
		bos.close();
		bis.close();
	}
}