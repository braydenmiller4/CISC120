public class RangeCheck {
    public static void main (String[] args){
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Boolean between = ((x > 0 && x < 1) && (y > 0 && y <1));

        System.out.println(between);
    }
}
