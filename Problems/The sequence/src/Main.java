
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int value;

        Scanner scanner=new Scanner(System.in);

        value=Math.abs(scanner.nextInt());
        int licznik=0;
        for( int i =1;i<=value;i++){
            for( int j=1;j<=i;j++)

            if (licznik<value) {
                if (licznik!=0) System.out.print(" ");
                System.out.print(i);
                licznik++;
            }
        }


    }
}