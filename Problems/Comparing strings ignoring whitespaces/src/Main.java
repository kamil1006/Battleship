import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);

        String linia1 = scanner.nextLine();
        String linia2 = scanner.nextLine();
        linia1=linia1.trim();
        linia1.replaceAll("\\s+","");
        linia2=linia2.trim();
        linia2.replaceAll("\\s+","");

        linia1=removeSpace(linia1);
        linia2=removeSpace(linia2);

        //System.out.println(linia1);
       // System.out.println(linia2);

        if(linia1.equals(linia2)) System.out.println(true);
        else System.out.println(false);
    }

    public static String removeSpace(String s) {
        String withoutspaces = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                withoutspaces += s.charAt(i);

        }
        return withoutspaces;

    }
}
