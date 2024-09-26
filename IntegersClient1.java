import java.util.Arrays;

public class IntegersClient1 {
    public static void main(String[] args){
        StdOut.println("This program will calculate the sum of Euler's totient function for all numbers from 1 to a given positive integer n.");

        StdOut.println("Please insert a positive integer to use as the n value.");
        long n = StdIn.readLong();

        long c = 0;
        for (long i = 1; i <= n; i++){
            c += Integers.totient(i);
        }
        StdOut.println("The total sum of Euler's totient function from 1 to " + n + " is: " + c);
    }
}
