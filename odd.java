public class odd {
    public static boolean isOdd(boolean b1, boolean b2, boolean b3){
        int trueCount = 0;
        if (b1) trueCount++;
        if (b2) trueCount++;
        if (b3) trueCount++;

        if (trueCount == 1 || trueCount == 3){
            return true;
        }else return false;
    }

    public static void main(String[] args){
        boolean b1 = Boolean.parseBoolean(args[0]);
        boolean b2 = Boolean.parseBoolean(args[1]);
        boolean b3 = Boolean.parseBoolean(args[2]);
        boolean result1 = isOdd(b1, b2, b3);
        System.out.println("Result 1: " + result1);
    }
}