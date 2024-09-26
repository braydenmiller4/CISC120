public class Interest {
	
	public static void main(String[] args) {
		
		double principle = Double.parseDouble(args[0]);
		double time = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		
		
		double amount = principle * Math.pow(Math.E, (rate*time));
		
		System.out.println(amount);
		
	}
}