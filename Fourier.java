public class Fourier {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int numPoints = 500;
        double[] t = linspace(-10, 10, numPoints);
        double[] func = fourierSpikes(t, n);

        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.005);

        for (int i = 1; i < numPoints; i++) {
            StdDraw.line(t[i - 1], func[i - 1], t[i], func[i]);
        }
    }

    public static double[] linspace(double start, double end, int n) {
        double[] array = new double[n];
        double step = (end - start) / (n - 1);
        for (int i = 0; i < n; i++) {
            array[i] = start + i * step;
        }
        return array;
    }

    public static double[] fourierSpikes(double[] t, int n) {
        double[] func = new double[t.length];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < t.length; j++) {
                func[j] += Math.cos(i * t[j]);
            }
        }
        for (int j = 0; j < t.length; j++) {
            func[j] /= n;
        }
        return func;
    }
}
