import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int max=n*n;

        int[][] tablica = new int[n*n][n*n];


        for(int a=0;a<n*n;a++){
            for(int b=0;b<n*n;b++)
                tablica[a][b]= scanner.nextInt();
        }



        /*
        for(int a=0;a<n*n;a++) {
            for (int b = 0; b < n*n; b++) {
                if (b > 0)
                    System.out.print(" " + tablica[a][b]);
                else
                    System.out.print(tablica[a][b]);
            }
            System.out.println();
        }
        */

        boolean wiersz=false;
        boolean kolumna=false;
        boolean solved=false;
        Set<Integer> zbior;
        int maximum =0;

        for(int a=0;a<n*n;a++) {
                zbior    =new HashSet<>();
                for (int b = 0; b < n*n; b++) {
                   zbior.add(tablica[a][b]);
                    if (maximum<tablica[a][b]) maximum=tablica[a][b];
                }
                if(zbior.size()==n*n && maximum==n*n) kolumna=true;
        }

        for (int b = 0; b < n*n; b++) {
            zbior    =new HashSet<>();

                for(int a=0;a<n*n;a++) {
                zbior.add(tablica[a][b]);

            }
            if(zbior.size()==n*n) wiersz=true;
        }


       // System.out.println(kolumna);
        //System.out.println(wiersz);


        boolean marker=true;
        for(int x =0;x<n;x++){
          for(int y=0;y<n;y++){
              zbior    =new HashSet<>();
                for(int a=0;a<n;a++){
                    for(int b=0;b<n;b++){
                        zbior.add(tablica[x*n+a][y*n+b]);
                     }
                }
              if(zbior.size()!=n*n) marker=false;

          }


        }
        //System.out.println(marker);
        if(wiersz&&kolumna&&marker) System.out.println("YES");
        else System.out.println("NO");

    }
}