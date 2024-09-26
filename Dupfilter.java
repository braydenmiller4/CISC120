public class Dupfilter {
    public static void main(String[] args) {
        int[] input = StdIn.readAllInts();

        for (int i = 0; i < (input.length - 1); i++){
            while (input[i] != input[i+1]){
                StdOut.print (input[i] + " ");
                break;
                }
        }
        StdOut.print (input[input.length -1]);
    }
}
