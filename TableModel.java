import java.util.Random;

public class TableModel
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        Random r = new Random();

        int number = r.nextInt(n);
        System.out.println(number);
    }
}