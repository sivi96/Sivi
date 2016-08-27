import java.util.Scanner;


public class Even {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("enter the number a:");
		a=s.nextInt();
		
		if(a%2==0)
		{
			System.out.println("a is even ");
		}
		else
		{
			System.out.println("a is odd");
		}
}
}
