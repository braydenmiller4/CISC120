public class Distance2 {
    public static void main(String[] args){

        int[] array1 = {1, 6, 7, 8};
        int[] array2 = {1, 4, 8, 1};
        int[] array3 = new int[4];

        array3[0] = array1[0] - array2[0];
        array3[1] = array1[1] - array2[1];
        array3[2] = array1[2] - array2[2];
        array3[3] = array1[3] - array2[3];

        array3[0] = array3[0]*array3[0];
        array3[1] = array3[1]*array3[1];
        array3[2] = array3[2]*array3[2];
        array3[3] = array3[3]*array3[3];

        int sum = array3[0] + array3[1] + array3[2] + array3[3];

        System.out.println(Math.sqrt(sum));
    }
}
