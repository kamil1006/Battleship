import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        int value;
        Scanner scanner=new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        do{
            value=scanner.nextInt();
            if(value!=0) lista.add(value);
        }
        while (value!=0);

        //for( int i:lista) System.out.println(i);

        boolean marker=false;
        String kierunek ="0";
        for(int i=1;i<lista.size();i++){
          if(i>1){
              if(lista.get(i)> lista.get(i-1) && !marker){
                  marker=true;kierunek="r";
              }
              if(lista.get(i)< lista.get(i-1) && !marker){
                  marker=true;kierunek="m";
              }

          }
        }
         boolean uporzadkowanie=false;
        marker=false;
        if(kierunek=="r"){
            for(int i=1;i<lista.size();i++) {
                if (i > 1) {
                    if (lista.get(i) < lista.get(i - 1) && !marker) {
                        marker = true;
                    }

                }
            }

        }else if(kierunek=="m"){
            for(int i=1;i<lista.size();i++) {
                if (i > 1) {
                    if (lista.get(i) > lista.get(i - 1) && !marker) {
                        marker = true;
                    }

                }
            }


        }



        if (marker==false) uporzadkowanie=true;

      //  System.out.println(kierunek);
        System.out.println(uporzadkowanie);
    }
}