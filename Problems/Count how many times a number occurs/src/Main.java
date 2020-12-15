import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
       int[] tablica = new int[size];

       for(int i=0;i<size; i++){
           tablica[i]=scanner.nextInt();
       }
        int toFind = scanner.nextInt();

       int count=0;
       for( int a:tablica){
           if (a==toFind) count++;
       }

        System.out.println(count);

    }
}