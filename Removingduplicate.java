import java.lang.*;

public class Removingduplicate {

	public static void main(String[] args) {
		String str = "malayalam";
		StringBuffer buf = new StringBuffer(str);
		for (int i = 0; i < buf.length(); i++) {
			for (int j = i + 1; j < buf.length(); j++) {
				if (buf.charAt(i) == buf.charAt(j))
				{	buf.deleteCharAt(j);
				j--;
			}}

		}
		str = buf.toString();
		System.out.println(str);
	}

}
