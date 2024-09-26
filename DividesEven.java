public class DividesEven
{
	public static void main(String[] args){
		boolean remainder;
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println(remainder = (a%b == 0 || b%a == 0));
		
	}
}