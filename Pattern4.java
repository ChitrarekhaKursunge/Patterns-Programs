import java.util.Scanner;
class Pattern4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of rows");
		int row=sc.nextInt();
		System.out.println("enter no. of columns");
		int column=sc.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=column; j++)
			{
				System.out.print("*" +" ");
			}
			System.out.println();
			column--;
		}
		
	}
}	