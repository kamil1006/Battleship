import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] tablica= new int[n][m];

        for(int a=0;a<n;a++){
            for(int b=0;b<m;b++)
                tablica[a][b]= scanner.nextInt();
       }

        int i=scanner.nextInt();
        int j=scanner.nextInt();

        int[][] tablica2= new int[n][m];

        for(int a=0;a<n;a++){
            for(int b=0;b<m;b++)
               if(b==j)
                   tablica2[a][b]=tablica[a][i];
               else if(b==i)
                   tablica2[a][b]=tablica[a][j];
               else
                   tablica2[a][b]=tablica[a][b];

        }

        for(int a=0;a<n;a++) {
            for (int b = 0; b < m; b++) {
                if (b > 0)
                    System.out.print(" " + tablica2[a][b]);
                else
                    System.out.print(tablica2[a][b]);
            }
            System.out.println();
        }
    }
}