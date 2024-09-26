public class PowersOfTwo {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int power = 1;

        while (power <= n){
            System.out.println(power);
            power = 2*power;
        }
    }
}
