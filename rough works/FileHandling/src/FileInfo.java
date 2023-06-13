import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		File my1stFile =new File("C:\\\\Users\\\\NadhirUsmanKV(Intern\\\\OneDrive - Bytestrone India Pvt Ltd\\\\Internship\\\\Java\\\\File Handling\\\\newFile.txt");
		
		if(my1stFile.exists())
		{
			System.out.println("File name:"+ my1stFile.getName());
			System.out.println("Absolute path:"+ my1stFile.getAbsolutePath());
			System.out.println("Writeable:"+ my1stFile.canWrite());
			System.out.println("Readable: "+ my1stFile.canRead());
			System.out.println("File size in bytes: "+ my1stFile.length());
		}else
		{
			System.out.println("The file does'nt exist ");
		}

	}

}
