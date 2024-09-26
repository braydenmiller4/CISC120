import java.util.Arrays;
import java.util.Random;
public class RumorSpread {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int previous_number = -1;
        int own_number = 0;
        int number;
        int c = 1; //counter starting at 1 for bob

        boolean[] array = new boolean[n];
        array[0] = true;
        Random r = new Random();

        for (int i = 1; i < n; i++)
        {
            number = r.nextInt(n);
            while (number == own_number || number == previous_number)
            {
                number = r.nextInt(n);
            }
            if (!array[number])
            {
               array[number] = true;
               c++;
            }else
            {
                break;
            }
            previous_number = own_number;
            own_number = number;
        }
        System.out.println("Percentage of guests that heard the rumor: " + (double) c/n*100 + "%");
        if(c == n)
        {
            System.out.println("The rumor fully propagated.");
        }else
        {
            System.out.println("The rumor did not fully propagate.");
        }
    }
}
