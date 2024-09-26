public class Isvaliddna {
    public static boolean ValidityCheck(String dna){
        //Makes sure each character in DNA string is either A,T,C, or G
        for(int i = 0; i < dna.length(); i++) {
                if (dna.charAt(i) != 'A' && dna.charAt(i) != 'T' && dna.charAt(i) != 'C' && dna.charAt(i) != 'G') return false;
        }
        return true;
    }

    public static void main(String[] args){
        String dna = args[0];

        System.out.println(ValidityCheck(dna));
    }
}
