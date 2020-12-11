import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int sum=0,licznik=0;

        for(int i=a;i<=b;i++){
            if (i%3==0) {
               sum+=i;
               licznik++;


            }
        }
    double srednia =(float)sum/(float) licznik;

        System.out.println(srednia);

    }
}