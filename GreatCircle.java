public class GreatCircle {
    
    public static void main(String[] args) {
        
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double sinx1 = Math.sin(x1);
        double sinx2 = Math.sin(x2);
        
        double cosx1 = Math.cos(x1);
        double cosx2 = Math.cos(x2);
        
        double cossubtract = Math.cos(y1 - y2);
        
        double d = 60 * Math.toDegrees(Math.acos(sinx1 * sinx2 + cosx1 * cosx2 * cossubtract));
        
        System.out.println("Distance = " + d + " nautical miles");
    }
}
