import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();


        // start coding here
        reader.close();
       // System.out.println(line);
        for(int i= line.length()-1;i>=0;i--){
            System.out.print(line.charAt(i));
        }
    }
}