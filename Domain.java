import java.util.Arrays;

public class Domain {
    public static void main(String[] args){
        String url = args[0];

        //Split the url at each .
        String[] split = url.split("\\.");

        //Print the last section of the url (everything after the last .)
        System.out.println(split[split.length-1]);
    }
}
