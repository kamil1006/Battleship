import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        List<Integer> lista = new ArrayList<>();
        int licznik=0;

        String wiersz1=scanner.nextLine();
        StringTokenizer st = new StringTokenizer(wiersz1," ");
        int count = st.countTokens();

        for(int i = 0;i <count; i++){
            licznik++;
            lista.add(Integer.valueOf(st.nextToken()));
            //System.out.println("token["+i+"]="+st.nextToken());
        }





      int[] tablica = new int[licznik];
        int i=0;
        for(int a:lista){
            tablica[i++]=a;
        }

      int rotation=scanner.nextInt();

        int[] tablica2 = new int[licznik];

        int przes=rotation%licznik;

        for(int x=0;x<licznik;x++){
            int pozycja;
           if(x-przes<0) pozycja=x-przes+licznik;
               else
                   pozycja=x-przes;



            tablica2[x]=tablica[pozycja];
            if(x!=0) System.out.print(" "+tablica2[x]);
            else System.out.print(tablica2[x]);
        }
        //System.out.println(przes);

    }
}