import java.util.Arrays;
import java.util.Scanner;
public class Dup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		String s1=s.nextLine();
		char[] a=s1.toCharArray();
		int[] num=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			num[i]=Character.getNumericValue(a[i]);
		}
		Arrays.sort(num);
	    int k;	System.out.println("Val");
		k=s.nextInt();
		for(int i=0;i<num.length-k;i++)
		{
			System.out.println(num[0]+""+num[1]);
		}
	}

}
