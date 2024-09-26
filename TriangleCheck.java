public class TriangleCheck {

	public static void main(String[] args){
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		boolean triangle;
		
		System.out.println(triangle = (a < b+c && b < a+c && c < a + b));
	}
}