import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String value = "";
        do{

                value = scanner.next();
                 if(!value.equals("0")) lista.add(value);


        }while (!value.equals("0"));


        for(String s: lista) {
            try{
                System.out.println(Integer.parseInt(s)*10);
            }
            catch (Exception e){
                System.out.println("Invalid user input: "+s);
            }

        }


    }

}