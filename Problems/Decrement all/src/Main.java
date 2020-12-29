import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String wiersz1=scanner.nextLine();

        StringTokenizer st = new StringTokenizer(wiersz1," ");
        int count = st.countTokens();


        for(int i = 0;i <count; i++){

            if (i==0) System.out.print(Integer.valueOf(st.nextToken())-1);
            else
                System.out.print(" "+ ((Integer.valueOf(st.nextToken())-1)));

        }

    }
}