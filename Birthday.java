import java.util.Random;
public class Birthday {
    public static void main(String[] args){

        int m = Integer.parseInt(args[0]); //Number of times to run simulation

        Random r = new Random();

        //Bool array 0-364.
        boolean[] array = new boolean[365];

        int c = 0; //Counter for each trial
        double total_steps = 0; //Total steps for simulation
        int n = 0; //Random number

        //Generate rand num and set that index to true while false
        for(int j = 0; j < m; j++)
        {
            for (int i = 0; i < 365; i++)
            {
                array[i] = false;
            }

            n = r.nextInt(365);
            while(!array[n])
            {
                array[n] = true;
                c++;
                n = r.nextInt(365);
            }
            total_steps += c;
            c = 0;
        }
        double average_steps = total_steps / m;
        System.out.println("Average Steps: " + average_steps);
    }
}
