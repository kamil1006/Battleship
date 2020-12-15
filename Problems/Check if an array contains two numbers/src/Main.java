import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] tablica = new int[size];

        for(int i=0;i<size; i++){
            tablica[i]=scanner.nextInt();
        }

        int first = scanner.nextInt();
        int second = scanner.nextInt();

       boolean mark=false;
        if(size>1){
            for(int i=1;i<size;i++){
                if(tablica[i]==second && tablica[i-1]==first || tablica[i-1]==second && tablica[i]==first) {
                    mark=true;
                    break;
                }
            }
        }


        System.out.println(mark);
    }
}