public class max3 {
    public static int max3(int a, int b, int c){
        int highest = 0;

        if (a > b && a > c) highest = a;
        else if (b > a && b > c) highest = b;
        else highest = c;

        return highest;
    }

    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int int_biggest = max3 (a, b, c);
        System.out.println("The largest number is: " + int_biggest);
    }
}
