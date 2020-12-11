import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       int value;
       int max=0;
        Scanner scanner=new Scanner(System.in);
        do{

           value=scanner.nextInt();
           if(value>max) max=value;

       }while (value!=0);
        System.out.println(max);
    }
}