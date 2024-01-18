public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Mayuri...";
		s = s.concat("JAVA Devloper");
		
		//System.out.println("After Conctenation..." + s);
		System.out.println(s);

	}

}
.............................................................................................................................................

public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Mayuri";
		
		char ch[]={'J','A','V','A'};
		String s2 = new String(ch);
			//Converts a char array into a String object.

		String s3 = new String("Devloper");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String str= "abc";
		str+="xyz";
		System.out.println(str);			
	}
}
