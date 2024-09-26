import java.util.Random;
public class Walker
{
    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        //Accumulator for steps
        int c = 0;


        //Variables for walker coordinates
        int x = 0;
        int y = 0;

        //Creates new random number generator
        Random r = new Random();

        //Variable for direction
        int direction;

        //Your code goes here
        while (Math.abs(x) < n && Math.abs(y) < n){

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
            else if(direction == 3) //West
            {
                x--;
                c++;
            }

        }

        System.out.print("The walker took ");
        System.out.print(c);
        System.out.println(" steps.");
    }
}