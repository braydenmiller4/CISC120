public class Calculate {
    public static void main(String[] args){

        //Manually prints the first row of headings
        for (int i = 0; i<11; i++){
            StdOut.printf ("%s\t", StdIn.readString());
        }
        StdOut.printf("%s\n", "Grade");

        int c = 0; //Counter for number of students

        //Variables for tracking class averages for each assignment
        double HW1Total = 0;
        double Quiz1Total = 0;
        double HW2Total = 0;
        double HW3Total = 0;
        double MidtermTotal = 0;
        double HW4Total = 0;
        double Quiz2Total = 0;
        double HW5Total = 0;
        double HW6Total = 0;
        double FinalTotal = 0;
        double GradeTotal = 0;

        while(!StdIn.isEmpty()){
            //Read names and grades in order from txt file
            String name = StdIn.readString();
            double HW1 = StdIn.readDouble();
            double Quiz1 = StdIn.readDouble();
            double HW2 = StdIn.readDouble();
            double HW3 = StdIn.readDouble();
            double Midterm = StdIn.readDouble();
            double HW4 = StdIn.readDouble();
            double Quiz2 = StdIn.readDouble();
            double HW5 = StdIn.readDouble();
            double HW6 = StdIn.readDouble();
            double Final = StdIn.readDouble();

            //Calculate average grade for each student
            double Grade = (HW1+Quiz1+HW2+HW3+Midterm+HW4+Quiz2+HW5+HW6+Final)/10;

            //Format for Std Output of each line
            String formats = "%s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f%s\n";

            //Print the formatted lines
            StdOut.printf(formats, name, HW1, Quiz1, HW2, HW3, Midterm, HW4, Quiz2, HW5, HW6, Final, Grade, "%");

            //Keeps track of total class scores for each assignment
            HW1Total += HW1;
            Quiz1Total += Quiz1;
            HW2Total += HW2;
            HW3Total += HW2;
            MidtermTotal += Midterm;
            HW4Total += HW4;
            Quiz2Total += Quiz2;
            HW5Total += HW5;
            HW6Total += HW6;
            FinalTotal += Final;
            GradeTotal += Grade;
            c++;
        }
        //Averages the class scores for each assignment
        double HW1Average = HW1Total/c;
        double Quiz1Average = Quiz1Total/c;
        double HW2Average = HW2Total/c;
        double HW3Average = HW3Total/c;
        double MidtermAverage = MidtermTotal/c;
        double HW4Average = HW4Total/c;
        double Quiz2Average = Quiz2Total/c;
        double HW5Average = HW5Total/c;
        double HW6Average = HW6Total/c;
        double FinalAverage = FinalTotal/c;
        double GradeAverage = GradeTotal/c;

        //Prints the last row with proper formatting
        String formats2 = "%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\t%.1f%s\n";
        StdOut.printf(formats2, "Average", HW1Average, "%", Quiz1Average, "%", HW2Average, "%", HW3Average, "%", MidtermAverage, "%", HW4Average, "%", Quiz2Average, "%", HW5Average, "%", HW6Average, "%", FinalAverage, "%", GradeAverage, "%");
    }
}