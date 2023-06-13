import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try
		{
			FileWriter myWriter=new FileWriter("C:\\\\Users\\\\NadhirUsmanKV(Intern\\\\OneDrive - Bytestrone India Pvt Ltd\\\\Internship\\\\Java\\\\File Handling\\\\my1stFile.txt");
		  myWriter.write("java is the prominent language in the millenium");
		  myWriter.close();
		  System.out.println("Succesfully wrote to the file");
		} catch(IOException e)
		{
			System.out.println("An error occured. ");
			e.printStackTrace();
		}

	}

}
