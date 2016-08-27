import java.util.Scanner;


public class Add {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		System.out.println("enter the number a:");
		a=s.nextInt();
		
		if(a==0)
		{
			System.out.println("a is zero ");
		}
		else if(a>0)
		{
			System.out.println("a is positive ");
		}
		else
		{
			System.out.println("a isnegative ");
		}

	}

}
