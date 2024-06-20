import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class BufferedReaderWriter
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		FileReader fr = new FileReader("C:\\fullstack\\Core Java\\20FileIO.\\BufferedReadWrite.txt");
		BufferedReader br =new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\fullstack\\Core Java\\20FileIO.\\BufferedReadWriteDestination.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		int info;

		while( (info = fr.read()) != -1)
		{
			bw.write(info);
		}
		bw.flush();
	}
}