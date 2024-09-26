public class Distance1 {
    public static void main(String[] args){

        int[] array1 = {1, 4, 5};
        int[] array2 = {2, 7, 6};
        int[] array3 = new int[3];

        array3[0] = array1[0] - array2[0];
        array3[1] = array1[1] - array2[1];
        array3[2] = array1[2] - array2[2];

        array3[0] = array3[0]*array3[0];
        array3[1] = array3[1]*array3[1];
        array3[2] = array3[2]*array3[2];

        int sum = array3[0] + array3[1] + array3[2];

        System.out.println(Math.sqrt(sum));
    }
}
