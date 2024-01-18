public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MADAM";
		String rev = "";

		System.out.println(str + " String is a Palindrome");
		
		char ch[] = new char[str.length()];
		for (int i= str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}	
	}
}
......................................................................................................................................
import java.util.Scanner;

public class StringPalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		String rev = "";

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String ");
		
		str = sc.nextLine();
		
		char ch[] = new char[str.length()];
		for (int i= str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}	
		
		if(str.equals(rev)) {
			   System.out.println(str + " String is a Palindrome");
		}
		else {
			   System.out.println(str + " String is not a Palindrome");
		}
	}
}

