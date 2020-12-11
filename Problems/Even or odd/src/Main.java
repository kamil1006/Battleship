import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int value;
       List<String> lista = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        do{

            value=Math.abs(scanner.nextInt());
            if(value%2==0 && value!=0)  lista.add("even");
            else if(value!=0) lista.add("odd");

        }while (value!=0);
        for(String s:lista)
        System.out.println(s);
    }
}