import java.util.Random;

public class Simulation
{
    public static void main(String[] args)
    {

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int i = 0; // Loop counter
        double total_steps = 0; // Accumulator for counting steps over all runs
        int c = 0; // Accumulator for counting steps per trial

        //Variables for coordinates
        int x = 0;
        int y = 0;

        //Creates new random number generator
        Random r = new Random();

        //Variable for direction
        int direction;

        while (i < m)
        {
            // Your walker experiment code goes here.
            c = 0;
            while (Math.abs(x) < n && Math.abs(y) < n)
            {
                direction = r.nextInt(4);
                if (direction == 0) //North
                {
                    y++;
                    c++;
                }
                else if (direction == 1) //East
                {
                    x++;
                    c++;
                }
                else if (direction == 2) //South
                {
                    y--;
                    c++;
                }
                else if (direction == 3) //West
                {
                    x--;
                    c++;
                }
            }
            i++;

            x = 0;
            y = 0;

            total_steps += c;  //This code assures your walker code keeps track of steps in an integer variable called c
           
        }


        double average_steps = total_steps / m;
        System.out.println("The average number of steps was: " + average_steps);
    }




}
