import java.util.Arrays;
import java.util.Random;
public class RumorSpreadSimulation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int previous_number = -1; //initialize previous_number to an invalid array index
        int own_number = 0;
        int number = 0;
        int c = 1; //counter starting at 1 for bob
        double total_count = 0;
        double fully_propagated = 0;

        boolean[] array = new boolean[n];
        Random r = new Random();

        for (int j = 0; j < m; j++)
        {
            Arrays.fill(array, false);
            array[0] = true;
            c = 1;
            previous_number = -1;
            own_number = 0;
            number = 0;
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
            total_count += c;
            if(c == n)
            {
                fully_propagated++;
            }
        }
        System.out.println("Percentage of runs that fully propagated: " + fully_propagated/m*100 + "%");
        System.out.println("Average percentage of people that heard the rumor: " + (total_count / (n*m)) * 100 + "%");
    }
}
