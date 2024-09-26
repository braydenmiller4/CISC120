public class IntegersClient2 {
    public static void main(String[] args){
        StdOut.println("This program takes an integer of your choice and first determines if it is prime. If it is not prime, it will output all of its factors.");

        StdOut.println("Please input an integer you would like to test.");
        long x = StdIn.readLong();

        if(Integers.isPrime(x)){
            System.out.println("This number is prime!");
        }else{
            System.out.println(Integers.factors(x));
        }
    }
}
