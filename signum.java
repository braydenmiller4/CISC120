public class signum {
    public static int signum(int n){
        if (n < 0) return -1;
        else if (n == 0) return 0;
        else return +1;
    }

    public static void main(String[] args){
        int n = (int) Double.parseDouble(args[0]);
        System.out.println(signum(n));
    }
}
