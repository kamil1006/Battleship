import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String line = reader.readLine();

        // start coding here
        reader.close();
        int iloscslow=0;
     /*

       int iloscLiter=0;
       boolean slowo=true;
        for(int i= 0;i<line.length();i++){
            if(line.charAt(i)==' ' && slowo==true) slowo=false;
            else
            if(line.charAt(i)!=' ' && slowo==false) slowo=true;
        }

        */

        StringTokenizer tokenizer = new StringTokenizer(line);


        System.out.println(tokenizer.countTokens());

    }
}