import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		try {
		File my1stFile =new File("C:\\Users\\NadhirUsmanKV(Intern\\OneDrive - Bytestrone India Pvt Ltd\\Internship\\Java\\File Handling\\my1stFile.txt");
		
		if(my1stFile.createNewFile())	
		{
			System.out.println("File created: "+ my1stFile.getName());
		}
		else
		{
			System.out.println("File already exists");
		}
		
		} catch (IOException e)
		{
			System.out.println("An error occured ");
			e.printStackTrace();
		}
		

	}

}
