public class sigmoid {
    public static double sigmoid(double x){
        double result = 1/(1+(Math.pow(Math.E, -x)));
        return result;
    }

    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        System.out.println(sigmoid(x));
    }
}
