public class PrimeCounter
{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primes = 0;

        for(int counter = 1; counter <= n; counter++) {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    primes++;
                }
            }
        }
        System.out.println(primes);
    }
}

