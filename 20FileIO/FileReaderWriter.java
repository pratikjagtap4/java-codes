import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


class FileReaderWriter
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileReader fr = new FileReader("C:\\fullstack\\Core Java\\20FileIO\\sourseReader.txt");
		FileWriter fw = new FileWriter("C:\\fullstack\\Core Java\\20FileIO\\destinationwriter.txt");
		int info;

		while( (info = fr.read())!=-1)
		{
			System.out.println(" " +(char)info);
			fw.write(info);
		}
		fr.close();
		fw.close();
	}
}