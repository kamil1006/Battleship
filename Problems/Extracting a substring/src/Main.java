import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String linia = scanner.nextLine();

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(a<=b && b<=linia.length())
            System.out.println(linia.substring(a,b+1));


    }
}