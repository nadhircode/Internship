import java.util.Scanner;

public class PasswordStrength {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		String password;
		System.out.println("Enter the password: ");
		password=scan.next();
		int counter=0;
		if(password.length()>7)
			counter++;
		int counter1=0;
		for(int i=0;i<password.length();i++)
			if(Character.isUpperCase(password.charAt(i)))
				counter1++;
		if(counter1>0)
			counter++;
		
		 counter1=0;
		for(int i=0;i<password.length();i++)
			if(Character.isLowerCase(password.charAt(i)))
				counter1++;
		if(counter1>0)
			counter++;
		
		 counter1=0;
		for(int i=0;i<password.length();i++)
			if(Character.isDigit(password.charAt(i)))
				counter1++;
		if(counter1>0)
			counter++;
		
		 counter1=0;
		for(int i=0;i<password.length();i++)
			if(!Character.isLetterOrDigit(password.charAt(i)))
				counter1++;
		if(counter1>0)
			counter++;
		switch(counter)
		{case 5:System.out.println("Strong password");
		break;
		case 4:System.out.println("Moderate password");
		break;
		case 3:System.out.println("Moderate password");
		break;
		default :System.out.println("weak password");
		break;
		}
	}

}
