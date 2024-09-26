public class Integers {
    /**
     * Function that finds whether parameter x is a prime number or a composite number
     * @param x integer in question
     * @return true if x is prime, false if x is composite
     */
    public static boolean isPrime(int x) {
        if (x <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Function that finds whether parameter x is a prime number or a composite number
     * @param x long in question
     * @return true if x is prime, false if x is composite
     */
    public static boolean isPrime(long x) {
        if (x <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Determines if two integers (x and y) are relatively prime
     * @param x integer 1
     * @param y integer 2
     * @return true if x and y are relatively prime, false if not
     */
    public static boolean relPrime(int x, int y){
        return (comDiv(x, y) == 1);
    }

    /**
     * Determines if two long values (x and y) are relatively prime
     * @param x long 1
     * @param y long 2
     * @return true if x and y are relatively prime, false if not
     */
    public static boolean relPrime(long x, long y){
        return (comDiv(x, y) == 1);
    }

    /**
     * Finds all of the factors for integer x
     * @param x integer to find factors of
     * @return an String containing all of the factors of x
     */
    public static String factors(int x){
        String factors = "The factors of " + x + " are: ";
        int c = 0;
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                factors += i + " ";
            }
        }
        return factors;
    }

    /**
     * Finds all of the factors for long x
     * @param x long to find factors of
     * @return a String containing all of the factors of x
     */
    public static String factors(long x){
        String factors = "The factors of " + x + " are: ";
        int c = 0;
        for (int i = 1; i <= x; i++){
            if (x % i == 0){
                factors += i + " ";
            }
        }
        return factors;
    }

    /**
     * Finds the greatest common divisor of two integers (x and y)
     * @param x integer 1
     * @param y integer 2
     * @return the greatest common divisor as an integer
     */
    public static int comDiv (int x, int y){
        int prod = x * y;
        int lcm = comMult(x, y);
        return prod/lcm;
    }

    /**
     * Finds the greatest common divisor of two long values (x and y)
     * @param x long 1
     * @param y long 2
     * @return the greatest common divisor as a long
     */
    public static long comDiv (long x, long y){
        long prod = x * y;
        long lcm = comMult(x, y);
        return prod/lcm;
    }

    /**
     * Finds the least common multiple of two integers (x and y)
     * @param x integer 1
     * @param y integer 2
     * @return the least common multiple as an integer
     */
    public static int comMult(int x, int y){
        int max = Math.max(x, y);

        while (true){
            if (max % x == 0 && max % y ==0){
                return max;
            }
            max++;
        }
    }

    /**
     * Finds the least common multiple of two long values (x and y)
     * @param x long 1
     * @param y long 2
     * @return the least common multiple as a long
     */
    public static long comMult(long x, long y){
        long max = Math.max(x, y);

        while (true){
            if (max % x == 0 && max % y ==0){
                return max;
            }
            max++;
        }
    }

    /**
     * Applies Euler's totient function to integer x
     * @param x integer to use in Euler's totient function
     * @return an integer
     */
    public static int totient(int x){
        int result = 0;
        for (int i = 1; i < x; i++){
            if (comDiv(i, x) == 1){
                result++;
            }
        }
        return result;
    }

    /**
     * Applies Euler's totient function to long value x
     * @param x long to use in Euler's totient function
     * @return a long
     */
    public static long totient(long x){
        int result = 0;
        for (int i = 1; i < x; i++){
            if (comDiv(i, x) == 1){
                result++;
            }
        }
        return result;
    }

}
