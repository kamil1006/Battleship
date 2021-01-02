import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here


        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        if (array.length==3 &&(
                (array[1]<=array[0] && array[0]<=array[2])||
                        (array[1]>=array[0] && array[0]>=array[2]))
        ){
            System.out.println(true);
        }else System.out.println(false);



    }
}