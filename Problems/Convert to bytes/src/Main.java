import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
       // InputStream inputStream = System.in;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();

        // start coding here
        reader.close();
        //System.out.println(line.getBytes());
        for(int i= 0;i<line.length();i++){
            System.out.print((byte)line.charAt(i));
        }


    }
}