import java.util.Random;
public class Sample2 {
    public static void main(String[] args){
        int m = 4;
        String[] input = StdIn.readAllLines();
        boolean[] duplicate = new boolean[input.length];

        for (int j = 0; j < m; j++){
            duplicate[j] = false;
        }

        Random random = new Random();
        int ran = 0;

        for (int i = 0; i < m; i++)
        {
            ran = random.nextInt(input.length);
            while (duplicate[ran]){
                ran = random.nextInt(input.length);
            }
            StdOut.println(input[ran]);
            duplicate[ran] = true;
        }
    }
}