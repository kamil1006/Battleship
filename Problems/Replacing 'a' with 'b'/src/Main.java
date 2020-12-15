import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String linia = scanner.nextLine();

        String nowy=linia.replace("a","b");
        System.out.println(nowy);

    }
}