public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("Mayuri");
		//sb.append(" Java");
		//sb.replace(2, 5, "Java");
		//sb.delete(1,3);
		sb.reverse();

		StringBuilder sb1= new StringBuilder("Devloper");
		sb1.insert(0,"Java");
		
		System.out.println(sb);
		System.out.println(sb1);
		
	}
}