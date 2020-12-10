import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int l=0,s=0,p=0;
        int a= scanner.nextInt();
        for(int x=0;x<a;x++){
            int b= scanner.nextInt();
            if(b==1) l++;
            else if(b==-1) s++;
            else p++;
        }
        System.out.println(p+" "+l+" "+s);
    }
}