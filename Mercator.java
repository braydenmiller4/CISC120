public class Mercator{
	
	public static void main(String[] args){
		
		double latitude = Double.parseDouble(args[0]);
		double longitude = Double.parseDouble(args[1]);
		double lambda_0 = Double.parseDouble(args[2]);
		
		latitude = Math.toRadians(latitude);
		longitude = Math.toRadians(longitude);
		lambda_0 = Math.toRadians(lambda_0);
		
		double x = longitude - lambda_0;
		double y = 0.5 * Math.log(( 1 + Math.sin(latitude) ) / ( 1 - Math.sin(latitude) ));

		x = Math.toDegrees(x);
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}
}