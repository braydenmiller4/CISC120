import java.util.Arrays;

public class normalize {
    public static double[] scale(double[] a, int n){
        //start with the min and max values as first index in array
        double max = a[0];
        double min = a[0];

        //find max value in array
        for (int i = 0; i < n-1; i++){
            max = Math.max(max, a[i+1]);
        }

        //find min value in array
        for (int i = 0; i < n-1; i++){
            min = Math.min(min, a[i+1]);
        }

        //Used to test min and max
        //System.out.println("min: " + min + "max: " + max);

        //equation for normalizing values
        double[] normalized = new double[n];
        for (int i = 0; i < n; i++){
            normalized[i] = (a[i] - min)/(max - min);
        }
        return normalized;
    }

    public static void main(String[] args){
        int n = StdIn.readInt();
        double[] result = scale(StdIn.readAllDoubles(), n);

        System.out.println(Arrays.toString(result));
    }
}
