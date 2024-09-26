public class Tabulate {
    public static void main(String[] args){
        String[] input = StdIn.readAllStrings();

        double row1_num1 = Double.parseDouble(input[1]);
        double row1_num2 = Double.parseDouble(input[2]);
        double row2_num1 = Double.parseDouble(input[4]);
        double row2_num2 = Double.parseDouble(input[5]);
        double row3_num1 = Double.parseDouble(input[7]);
        double row3_num2 = Double.parseDouble(input[8]);
        double row4_num1 = Double.parseDouble(input[10]);
        double row4_num2 = Double.parseDouble(input[11]);

        double div1 = row1_num1 / row1_num2;
        double div2 = row2_num1 / row2_num2;
        double div3 = row3_num1 / row3_num2;
        double div4 = row4_num1 / row4_num2;

        String formats = "%-8s %-5.0f %-5.0f %.3f\n";
        StdOut.printf(formats, input[0], row1_num1, row1_num2, div1);
        StdOut.printf(formats, input[3], row2_num1, row2_num2, div2);
        StdOut.printf(formats, input[6], row3_num1, row3_num2, div3);
        StdOut.printf(formats, input[9], row4_num1, row4_num2, div4);

    }
}
