import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);

        System.out.print("Enter the replacement character: ");
        char newChar = scanner.nextLine().charAt(0);

        try {
            File file = new File("C:\\Users\\NadhirUsmanKV(Intern\\OneDrive - Bytestrone India Pvt Ltd\\Internship\\Java\\File Handling\\my1stFile.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String replacedLine = line.replace(oldChar, newChar);
                System.out.println(replacedLine);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
