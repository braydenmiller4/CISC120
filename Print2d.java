public class Print2d
{
    public static void main(String[] args)
    {
        boolean[][] array =
                {
                    {true, true, false, false},
                    {false, true, false, true},
                    {true, true, true, true},
                    {false, false, true, false}
                };

        System.out.println("  1 2 3 4");

        for (int i = 0; i < 4; i++)
        {
            System.out.print(i+1 + " ");
            for (int j = 0; j < 4; j++)
            {
                if (array[i][j] && j != 3)
                {
                    System.out.print("* ");
                }else if (!array[i][j] && j != 3)
                {
                    System.out.print("  ");
                }else if (array[i][j])
                {
                    System.out.println("*");
                }else if (!array[i][j])
                {
                    System.out.println(" ");
                }
            }
        }
    }
}
