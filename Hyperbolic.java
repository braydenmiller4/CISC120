/**
 * Finds the hyperbolic functions of given double value x.
 *
 * Functions available in this library are:
 * sin, cos, tan, sec, csc, cot.
 *
 * Main function was used to test each function to make
 * sure expected value was returned.
 */
public class Hyperbolic {
    public static double sin(double x){
        return (Math.exp(x) - Math.exp(-x))/2;
    }

    public static double cos(double x){
        return (Math.exp(x) + Math.exp(-x))/2;
    }

    public static double tan(double x){
        return (Math.exp(x) - Math.exp(-x))/(Math.exp(x) + Math.exp(-x));
    }

    public static double sec(double x){
        return 2/(Math.exp(x) + Math.exp(-x));
    }

    public static double csc(double x){
        return 2/(Math.exp(x) - Math.exp(-x));
    }

    public static double cot(double x){
        return (Math.exp(x) + Math.exp(-x)) / (Math.exp(x) - Math.exp(-x));
    }

    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        System.out.println("sin: " + sin(x));
        System.out.println("cos: " + cos(x));
        System.out.println("tan: " + tan(x));
        System.out.println("sec: " + sec(x));
        System.out.println("csc: " + csc(x));
        System.out.println("cot: " + cot(x));
    }
}
