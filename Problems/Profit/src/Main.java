import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

       double M =Math.abs(scanner.nextInt());
        double P =Math.abs(scanner.nextInt());
        int K =Math.abs(scanner.nextInt());
        int lata=0;
        while (M<K){
            M=M+M*(P/100);
           // System.out.println(M);
            lata++;

        }
        System.out.println(lata);
    }
}