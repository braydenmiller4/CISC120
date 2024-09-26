public class Peaks {
    public static void main(String[] args){
        String[] input = StdIn.readAllStrings();
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        int[][] terrain = new int[columns][rows];

        int counter = 3;
        int peaks = 0;

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < columns; c++) {
                terrain[c-1][r-1] = Integer.parseInt(input[counter]);
                counter++;
            }
        }
//Only check for peaks when not at the corner
        for (int r = 0; r < rows; r++){
            for (int c = 0; c < columns; c++){
                boolean isPeak = true;

                if (c > 0 && terrain[c][r] <= terrain[c - 1][r]) {
                    isPeak = false;  // Check left
                }
                if (c < columns - 1 && terrain[c][r] <= terrain[c + 1][r]) {
                    isPeak = false;  // Check right
                }
                if (r > 0 && terrain[c][r] <= terrain[c][r - 1]) {
                    isPeak = false;  // Check above
                }
                if (r < rows - 1 && terrain[c][r] <= terrain[c][r + 1]) {
                    isPeak = false;  // Check below
                }

                if (isPeak) {
                    peaks++;
                }
            }
        }
        StdOut.println(peaks);
    }
}
