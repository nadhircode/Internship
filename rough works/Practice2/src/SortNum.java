import java.util.Scanner;

public class SortNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,swap1,t;
		System.out.println("Enter the number of numbers");
		num=scan.nextInt();
		int[] numb=new int[num];
		System.out.println("Enter the numbers");
		for(int i=0;i<num;i++)
		numb[i]=scan.nextInt();
		
		for(int i=0;i<num-1;i++)
		for (int j = 0; j < num - i - 1; j++)
			{if(numb[j]>numb[j+1])
			
			{
				t=numb[j+1];
				numb[j+1]=numb[j];
				numb[j]=t;
			}
			
			}
		System.out.println("The sorter numbers are : ");
		for(int i=0;i<num;i++)
			System.out.println(numb[i]);
		
		
		
	}

}
