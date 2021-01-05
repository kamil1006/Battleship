package battleship;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) {
        // Write your code here
        int size=11;
        Scanner scanner= new Scanner(System.in);
        //------------------------------------------
        //**************************************************************************************************
        System.out.println("Player 1, place your ships on the game field");
        Plansza plansza = new Plansza(size);
        plansza.nazwaGracza="Player 1";
        plansza.wyswietlPole();
        plansza.inicjujStatki(5);

        Statek statek5,statek4,statek3,statek3a,statek2;
        plansza.inicjujStatki(5);

        //**************
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        boolean pchacz=false;
        while (!pchacz){

            System.out.print("> ");
            String input=scanner.nextLine();

            int[] w =plansza.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek5 = new Statek(w[0], w[1], w[2], w[3], 5, "Aircraft");
                boolean a= statek5.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek5.testNaDlugosc(w[0], w[1], w[2], w[3],5);
                boolean c= statek5.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek5.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza.sprawdNiezKolizje(statek5);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza.statki[0]=statek5;

                    plansza.statkiMaszty[0][0]=0;
                    plansza.statkiMaszty[0][1]=5;

                    plansza.iloscMasztow+=5;
                    plansza.rysujStatek(0);
                    plansza.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek5.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");

                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        while (!pchacz){

            System.out.print("> ");
            String input=scanner.nextLine();

            int[] w =plansza.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek4 = new Statek(w[0], w[1], w[2], w[3], 4, "Battleship");
                boolean a= statek4.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek4.testNaDlugosc(w[0], w[1], w[2], w[3],4);
                boolean c= statek4.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek4.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza.sprawdNiezKolizje(statek4);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza.statki[1]=statek4;

                    plansza.statkiMaszty[1][0]=0;
                    plansza.statkiMaszty[1][1]=4;

                    plansza.rysujStatek(1);
                    plansza.iloscMasztow+=4;
                    plansza.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek4.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        while (!pchacz){

            System.out.print("> ");
            String input=scanner.nextLine();

            int[] w =plansza.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek3 = new Statek(w[0], w[1], w[2], w[3], 3, "Submarine");
                boolean a= statek3.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek3.testNaDlugosc(w[0], w[1], w[2], w[3],3);
                boolean c= statek3.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek3.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza.sprawdNiezKolizje(statek3);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza.statki[2]=statek3;

                    plansza.statkiMaszty[2][0]=0;
                    plansza.statkiMaszty[2][1]=3;

                    plansza.iloscMasztow+=3;
                    plansza.rysujStatek(2);
                    plansza.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek3.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        while (!pchacz){

            System.out.print("> ");
            String input=scanner.nextLine();

            int[] w =plansza.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek3a = new Statek(w[0], w[1], w[2], w[3], 3, "Cruiser");
                boolean a= statek3a.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek3a.testNaDlugosc(w[0], w[1], w[2], w[3],3);
                boolean c= statek3a.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek3a.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza.sprawdNiezKolizje(statek3a);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza.statki[3]=statek3a;

                    plansza.statkiMaszty[3][0]=0;
                    plansza.statkiMaszty[3][1]=3;

                    plansza.rysujStatek(3);
                    plansza.iloscMasztow+=3;
                    plansza.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek3a.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        while (!pchacz){

            System.out.print("> ");
            String input=scanner.nextLine();

            int[] w =plansza.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek2 = new Statek(w[0], w[1], w[2], w[3], 2, "Destroyer");
                boolean a= statek2.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek2.testNaDlugosc(w[0], w[1], w[2], w[3],2);
                boolean c= statek2.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek2.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza.sprawdNiezKolizje(statek2);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza.statki[4]=statek2;

                    plansza.statkiMaszty[4][0]=0;
                    plansza.statkiMaszty[4][1]=2;

                    plansza.iloscMasztow+=2;
                    plansza.rysujStatek(4);
                    plansza.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek2.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");

                }
            }

        }
        /*
         */
        //**************************************************************************************************
        System.out.println("Press Enter and pass the move to another player");
        System.out.print("> ");
        String input=scanner.nextLine();
        System.out.println("Player 2, place your ships to the game field");
        //**************************************************************************************************
        Plansza plansza2 = new Plansza(size);
        plansza2.nazwaGracza="Player 2";
        plansza2.wyswietlPole();
        plansza2.inicjujStatki(5);

        Statek statek55,statek44,statek33,statek33a,statek22;
        plansza2.inicjujStatki(5);

        //**************
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        pchacz=false;
        while (!pchacz){

            System.out.print("> ");
            input=scanner.nextLine();

            int[] w =plansza2.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek55 = new Statek(w[0], w[1], w[2], w[3], 5, "Aircraft");
                boolean a= statek55.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek55.testNaDlugosc(w[0], w[1], w[2], w[3],5);
                boolean c= statek55.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek55.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza2.sprawdNiezKolizje(statek55);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza2.statki[0]=statek55;

                    plansza2.statkiMaszty[0][0]=0;
                    plansza2.statkiMaszty[0][1]=5;

                    plansza2.iloscMasztow+=5;
                    plansza2.rysujStatek(0);
                    plansza2.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek55.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");

                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Battleship (4 cells):");
        while (!pchacz){

            System.out.print("> ");
            input=scanner.nextLine();

            int[] w =plansza2.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek44 = new Statek(w[0], w[1], w[2], w[3], 4, "Battleship");
                boolean a= statek44.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek44.testNaDlugosc(w[0], w[1], w[2], w[3],4);
                boolean c= statek44.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek44.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza2.sprawdNiezKolizje(statek44);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza2.statki[1]=statek44;

                    plansza2.statkiMaszty[1][0]=0;
                    plansza2.statkiMaszty[1][1]=4;

                    plansza2.rysujStatek(1);
                    plansza2.iloscMasztow+=4;
                    plansza2.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek44.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Submarine (3 cells):");
        while (!pchacz){

            System.out.print("> ");
            input=scanner.nextLine();

            int[] w =plansza2.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek33 = new Statek(w[0], w[1], w[2], w[3], 3, "Submarine");
                boolean a= statek33.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek33.testNaDlugosc(w[0], w[1], w[2], w[3],3);
                boolean c= statek33.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek33.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza2.sprawdNiezKolizje(statek33);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza2.statki[2]=statek33;

                    plansza2.statkiMaszty[2][0]=0;
                    plansza2.statkiMaszty[2][1]=3;

                    plansza2.iloscMasztow+=3;
                    plansza2.rysujStatek(2);
                    plansza2.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek33.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
        while (!pchacz){

            System.out.print("> ");
            input=scanner.nextLine();

            int[] w =plansza2.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek33a = new Statek(w[0], w[1], w[2], w[3], 3, "Cruiser");
                boolean a= statek33a.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek33a.testNaDlugosc(w[0], w[1], w[2], w[3],3);
                boolean c= statek33a.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek33a.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza2.sprawdNiezKolizje(statek33a);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza2.statki[3]=statek33a;

                    plansza2.statkiMaszty[3][0]=0;
                    plansza2.statkiMaszty[3][1]=3;

                    plansza2.rysujStatek(3);
                    plansza2.iloscMasztow+=3;
                    plansza2.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek33a.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");
                }
            }

        }

        //**************
        pchacz=false;
        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
        while (!pchacz){

            System.out.print("> ");
            input=scanner.nextLine();

            int[] w =plansza2.zamienStringNaWspolrzedne(input);
            if(w!=null) {
                statek22 = new Statek(w[0], w[1], w[2], w[3], 2, "Destroyer");
                boolean a= statek22.sprawdzPoziomoPionowo(w[0], w[1], w[2], w[3]) ;
                boolean b= statek22.testNaDlugosc(w[0], w[1], w[2], w[3],2);
                boolean c= statek22.testNaWystawaniePozaPlansze(w[0], w[1], w[2], w[3],size-1);
                boolean d= statek22.testNaZero(w[0], w[1], w[2], w[3]);
                boolean e= plansza2.sprawdNiezKolizje(statek22);
                if(a&&b&&c&&d&&e) {
                    pchacz = true;
                    plansza2.statki[4]=statek22;

                    plansza2.statkiMaszty[4][0]=0;
                    plansza2.statkiMaszty[4][1]=2;

                    plansza2.iloscMasztow+=2;
                    plansza2.rysujStatek(4);
                    plansza2.wyswietlPole();
                }else{
                    if(!a || !c || !d) System.out.println("Error! Wrong ship location! Try again:");
                    if(!b) System.out.println("Error! Wrong length of the "+statek22.getNazwa()+"! Try again:");
                    if(!e) System.out.println("Error! You placed it too close to another one. Try again:");

                }
            }

        }

        //**************************************************************************************************
        System.out.println("Press Enter and pass the move to another player");
        System.out.print("> ");
        input=scanner.nextLine();


        //**************************************************************************************************

        //System.out.println("\nThe game starts!\n");




        pchacz=false;
        String biezacyGracz=plansza.nazwaGracza;

        while (!pchacz){


            //----------------------------------------
            if(biezacyGracz==plansza.nazwaGracza) {

                plansza2.wyswietlPoleStrzalow();
                System.out.println("---------------------");
                plansza.wyswietlPole();
                // System.out.println("\nTake a shot!\n");
                System.out.println(biezacyGracz+", it's your turn:");
                System.out.print("> ");
                biezacyGracz=plansza2.nazwaGracza;


                input = scanner.nextLine();
                int[] w = plansza2.zamienStrzalNaWspolrzedne(input);
                if (w != null) {
                    int rezultat = plansza2.strzal(w);
                    if (rezultat == -1) {
                        System.out.println("Error! You entered the wrong coordinates! Try again:\n");
                    } else if (rezultat == 0) {
                        //plansza.wyswietlPoleStrzalow();
                        System.out.println("You missed!\n");
                        //plansza.wyswietlPole();
                    } else {
                        // plansza.wyswietlPoleStrzalow();
                        System.out.println("You hit a ship!\n");
                        //plansza.wyswietlPole();
                        // plansza.iloscMasztow--;
                        if (plansza2.wykonczonyStatek && plansza2.iloscMasztow != 0) {
                            System.out.println("You sank a ship! Specify a new target:");
                            plansza2.wykonczonyStatek = false;
                        }
                        if (plansza2.iloscMasztow == 0) {
                            pchacz = true;
                            System.out.println("You sank the last ship. You won. Congratulations!");
                        }
                    }


                }
            }
            //----------------------------------------
            else {

                plansza.wyswietlPoleStrzalow();
                System.out.println("---------------------");
                plansza2.wyswietlPole();
                // System.out.println("\nTake a shot!\n");
                System.out.println(biezacyGracz+", it's your turn:");
                biezacyGracz=plansza.nazwaGracza;
                System.out.print("> ");


                input = scanner.nextLine();
                int[] w = plansza.zamienStrzalNaWspolrzedne(input);
                if (w != null) {
                    int rezultat = plansza.strzal(w);
                    if (rezultat == -1) {
                        System.out.println("Error! You entered the wrong coordinates! Try again:\n");
                    } else if (rezultat == 0) {
                        //plansza.wyswietlPoleStrzalow();
                        System.out.println("You missed!\n");
                        //plansza.wyswietlPole();
                    } else {
                        // plansza.wyswietlPoleStrzalow();
                        System.out.println("You hit a ship!\n");
                        //plansza.wyswietlPole();
                        // plansza.iloscMasztow--;
                        if (plansza.wykonczonyStatek && plansza.iloscMasztow != 0) {
                            System.out.println("You sank a ship! Specify a new target:");
                            plansza.wykonczonyStatek = false;
                        }
                        if (plansza.iloscMasztow == 0) {
                            pchacz = true;
                            System.out.println("You sank the last ship. You won. Congratulations!");
                        }
                    }


                }




            }
            //----------------------------------------
            if(!pchacz){
                System.out.println("Press Enter and pass the move to another player");
                System.out.print("> ");
                input=scanner.nextLine();
            }

        }
        //**************



        //**************


        //**************

        //System.out.println(tokenizer.countTokens());



    }


}

//#######################################################################################33
//#######################################################################################33
class Plansza{

    public String nazwaGracza;

    public int size;
    public String [][] poleWalki;
    public String [][] poleStatki1;
    public String [][] poleStrzalow;

    public int iloscMasztow;
    public Statek[] statki;
    public int[][] statkiMaszty;
    public boolean wykonczonyStatek;

    //---------------------------------------------
    public Plansza(int size) {
        this.size = size;
        poleWalki = new String[size+1][size+1];
        poleStatki1 = new String[size+1][size+1];
        poleStrzalow = new String[size+1][size+1];
        iloscMasztow=0;
        wykonczonyStatek=false;


        // wszystkie pola  falujemy
        for(int x=1;x<size;x++) {
            for (int y = 1; y < size ; y++) {
                poleWalki[x][y] = "~";
                poleStatki1[x][y] = "~";
                poleStrzalow[x][y] = "~";
            }
        }
        poleWalki[0][0]="";
        poleStatki1[0][0]="";
        poleStrzalow[0][0]="";
        //numerujemy kolumny
        for(int i=1;i<size;i++) {
            poleWalki[0][i]= String.valueOf(i);
            poleStatki1[0][i]= String.valueOf(i);
            poleStrzalow[0][i]= String.valueOf(i);
        }

        // literujemy wiersze
        char litera='A';
        for(int i=1;i<size;i++) {
            poleWalki[i][0]= String.valueOf(litera);
            poleStatki1[i][0]= String.valueOf(litera);
            poleStrzalow[i][0]= String.valueOf(litera++);

        }



    }
    //---------------------------------------------
    public void wyswietlPole(){
        //wyswietlamy pole walki
        for(int x=0;x<size;x++){
            for(int y=0;y<size;y++){
                System.out.print(" "+poleWalki[x][y]);
            }
            System.out.println();
        }


    }
    //---------------------------------------------
    public void wyswietlPoleStrzalow(){
        //wyswietlamy pole walki
        for(int x=0;x<size;x++){
            for(int y=0;y<size;y++){
                System.out.print(" "+poleStrzalow[x][y]);
            }
            System.out.println();
        }


    }
    //---------------------------------------------
    void inicjujStatki(int n){

        statki=new Statek[n];
        statkiMaszty=new int[n][2];
    }


    //---------------------------------------------
    public int[] zamienStringNaWspolrzedne(String s){
        int[] wspolrzedne= new int[4];
        StringTokenizer tokenizer = new StringTokenizer(s," ");

        if(tokenizer.countTokens()==2){
            //*******************************************************
            String aa=tokenizer.nextToken().toUpperCase(Locale.ROOT);
            String s1 = aa.replaceAll("[*0-9]", "");

            int s2= Integer.parseInt(aa.replaceAll("[*a-zA-Z]", ""));


            int y1=zamienCharNaInt(s1.charAt(0));
            int x1 = s2;
            //*******************************************************
            String bb=tokenizer.nextToken().toUpperCase(Locale.ROOT);

            s1 = bb.replaceAll("[*0-9]", "");

            s2= Integer.parseInt(bb.replaceAll("[*a-zA-Z]", ""));


            int y2=zamienCharNaInt(s1.charAt(0));
            int x2 = s2;



            //*******************************************************

            //System.out.println(aa+" x1= "+ x1 +" y1="+y1);
            //System.out.println(bb+" x2= "+ x2 +" y2="+y2);
            if(x1==x2){
                if(y1>y2){
                    wspolrzedne[0]=x1;
                    wspolrzedne[1]=y2;
                    wspolrzedne[2]=x2;
                    wspolrzedne[3]=y1;
                } else{
                    wspolrzedne[0]=x1;
                    wspolrzedne[1]=y1;
                    wspolrzedne[2]=x2;
                    wspolrzedne[3]=y2;
                }

            } else if(y1==y2){
                if(x1>x2){
                    wspolrzedne[0]=x2;
                    wspolrzedne[1]=y1;
                    wspolrzedne[2]=x1;
                    wspolrzedne[3]=y2;
                }
                else {
                    wspolrzedne[0]=x1;
                    wspolrzedne[1]=y1;
                    wspolrzedne[2]=x2;
                    wspolrzedne[3]=y2;

                }
            }




            return wspolrzedne;
        }else
            return null;
    }
    //---------------------------------------------
    public int zamienCharNaInt(char c){

        int i = c - 'A'+1;

        return i;
    }

    //---------------------------------------------
    public int[] zamienStrzalNaWspolrzedne(String s){
        int[] wspolrzedne= new int[2];
        StringTokenizer tokenizer = new StringTokenizer(s," ");

        if(tokenizer.countTokens()==1){
            //*******************************************************
            String aa=tokenizer.nextToken().toUpperCase(Locale.ROOT);
            String s1 = aa.replaceAll("[*0-9]", "");

            int s2= Integer.parseInt(aa.replaceAll("[*a-zA-Z]", ""));


            int y1=zamienCharNaInt(s1.charAt(0));
            int x1 = s2;
            //*******************************************************


            wspolrzedne[0]=x1;
            wspolrzedne[1]=y1;
            return wspolrzedne;
        }else
            return null;
    }
    //---------------------------------------------
    public boolean sprawdNiezKolizje(Statek statek){

        int a1=statek.x1;
        int b1=statek.y1;
        int a2=statek.x2;
        int b2=statek.y2;

        int minx=Math.min(a1, a2);
        int miny=Math.min(b1, b2);
        int maxx=Math.max(a1, a2);
        int maxy=Math.max(b1, b2);

        minx=Math.max(minx-1, 1);
        maxx=Math.min(maxx+1, size-1);

        miny=Math.max(miny-1, 1);
        maxy=Math.min(maxy+1, size-1);

        boolean warunek=true;

        for (int x=minx;x<=maxx;x++){
            for (int y=miny;y<=maxy;y++){
                if(poleWalki[y][x]=="O") warunek=false;
            }
        }


        return warunek;
    }
    //---------------------------------------------
    public void rysujStatek(int n) {
        for(int a=statki[n].x1;a<=statki[n].x2;a++){
            for(int b=statki[n].y1;b<=statki[n].y2;b++){
                poleWalki[b][a]="O";
                //poleStatki1[b][a]="O";
                poleStatki1[b][a]=Integer.toString(n);
            }
        }


    }
    //---------------------------------------------
    public int strzal(int[] w) {
        if(w[0]>size-1||w[0]<1 ||w[1]>size-1||w[1]<1 ){
            return -1;
        }else {
            String coJest=poleWalki[w[1]][w[0]];
            if(coJest.equals("O")) {
                poleWalki[w[1]][w[0]]="X";
                poleStrzalow[w[1]][w[0]]="X";
                int statekNr = Integer.parseInt(poleStatki1[w[1]][w[0]]);
                int statekMaszty=statkiMaszty[statekNr][1];
                statkiMaszty[statekNr][1]--;
                iloscMasztow--;
                if(statkiMaszty[statekNr][1]==0)
                    wykonczonyStatek=true;

                return 1;
            }
            else if(coJest.equals("~")||coJest.equals("M"))
            {
                poleWalki[w[1]][w[0]]="M";
                poleStrzalow[w[1]][w[0]]="M";

                return 0;
            } else {

                return 1;
            }


        }

    }


    //---------------------------------------------

}

//#######################################################################################33
//#######################################################################################33
class Statek{
    int x1,y1;
    int x2,y2;

    int maszty;
    char[] pola;

    String nazwa;
    //---------------------------------------------
    public Statek(int x1, int y1, int x2, int y2, int maszty, String nazwa) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.maszty = maszty;
        this.nazwa = nazwa;
        pola = new char[maszty];

    }
    //---------------------------------------------
    public boolean sprawdzPoziomoPionowo(int x1, int y1, int x2, int y2){

        if(x1==x2 || y1==y2) return true;
        else

            return false;
    }
    //---------------------------------------------
    public boolean testNaZero(int x1, int y1, int x2, int y2){

        if(x1==0 || y1==0||x2==0 || y2==0) return false;
        else

            return true;
    }

    //---------------------------------------------
    public boolean testNaWystawaniePozaPlansze(int x1, int y1, int x2, int y2,int rozmiarPlanszy){

        if(x1>rozmiarPlanszy || y1>rozmiarPlanszy||x2>rozmiarPlanszy || y2>rozmiarPlanszy) return false;
        else

            return true;
    }

    //---------------------------------------------
    public boolean testNaDlugosc(int x1, int y1, int x2, int y2,int rozmiarSatku){

        if(x1==x2 && Math.abs(y2-y1)+1==rozmiarSatku){
            return true;
        }
        else if(y1==y2&& Math.abs(x2-x1)+1==rozmiarSatku){
            return true;
        }else {
            return false;
        }

    }

    //---------------------------------------------

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getMaszty() {
        return maszty;
    }

    public void setMaszty(int maszty) {
        this.maszty = maszty;
    }

    public char[] getPola() {
        return pola;
    }

    public void setPola(char[] pola) {
        this.pola = pola;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    //---------------------------------------------
}
//#######################################################################################33
//#######################################################################################33

