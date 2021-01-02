import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void inverseFlags(boolean[] flagi) {
        // write your code here
        int rozmiar=flagi.length;
        for (int k=0;k<rozmiar;k++){
            if(flagi[k]==true){
                flagi[k]=false;
            }else flagi[k]=true;
        }


    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Boolean> booleans = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Boolean::parseBoolean)
                .collect(Collectors.toList());
        final boolean[] flags = new boolean[booleans.size()];
        for (int i = 0; i < flags.length; i++) {
            flags[i] = booleans.get(i);
        }
        inverseFlags(flags);
        final String representation = Arrays.toString(flags)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println(representation);
    }
}