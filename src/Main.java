import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){



        while(true){

        System.out.println("1=Parita cisiel 2= Cislo Slovne 3= Tyždne" );
        Scanner s0 = new Scanner(System.in);
        int n0 = s0.nextInt();
        switch (n0){
            case 1:
                System.out.println("Vložte cislo na zistenie parity" );
                Scanner s1 = new Scanner(System.in);
                int n1 = s1.nextInt();
                boolean done = n1 % 2 ==0;
                if(done){System.out.println("parne");
                


                }
                else{System.out.println("Neparne");




                }




                break;
            case 2:
                System.out.println("1=IF ELSE 2= SWITCH 3= NEKONECNE CISLA 4=do miliona s sklonovanim" );
                Scanner s2 = new Scanner(System.in);
                int n2 = s2.nextInt();
                switch (n2){
                    case 1:
                        System.out.println("Vložte cislo na precitanie 0-9" );
                             Scanner s3 = new Scanner(System.in);
                             int n3 = s3.nextInt();
                             if(n3 == 0){System.out.println("Nula");}
                             else if(n3 == 1){System.out.println("Jedna");}
                             else if(n3 == 2){System.out.println("Dva");}
                             else if(n3 == 3){System.out.println("Tri");}
                             else if(n3 == 4){System.out.println("Štyri");}
                             else if(n3 == 5){System.out.println("Pät");}
                             else if(n3 == 6){System.out.println("Šest");}
                             else if(n3 == 7){System.out.println("Sedem");}
                             else if(n3 == 8){System.out.println("Osem");}
                             else if(n3 == 9){System.out.println("Devat");}

                             break;
                    case 2:
                        System.out.println("Vložte cislo na precitanie 0-9" );
                        Scanner s4 = new Scanner(System.in);
                        int n4 = s4.nextInt();
                        switch (n4){
                            case 1:
                                System.out.println("Jedna");

                                break;
                            case 2:
                                System.out.println("Dva");

                                break;
                            case 3:
                                System.out.println("Tri");

                                break;
                            case 4:
                                System.out.println("Styri");

                                break;
                            case 5:
                                System.out.println("Pät");

                                break;
                            case 6:
                                System.out.println("Šest");

                                break;
                            case 7:
                                System.out.println("Sedem");

                                break;
                            case 8:
                                System.out.println("Osem");

                                break;
                            case 9:
                                System.out.println("Devat");

                                break;
                            case 0:
                                System.out.println("Nula");

                                break;
                        }

                                break;
                    case 3:
                        System.out.println("Vložte cislo na precitanie - Nekonecno" );
                        Scanner s5 = new Scanner(System.in);
                        int n5 = s5.nextInt();
                        LinkedList<Integer> stack = new LinkedList<Integer>();
                        while (n5 > 0) {
                            stack.push( n5 % 10 );
                            n5 = n5 / 10;
                        }

                        while (!stack.isEmpty()) {
                            switch (stack.pop()){
                                case 1:
                                    System.out.println("Jedna");

                                    break;
                                case 2:
                                    System.out.println("Dva");

                                    break;
                                case 3:
                                    System.out.println("Tri");

                                    break;
                                case 4:
                                    System.out.println("Styri");

                                    break;
                                case 5:
                                    System.out.println("Pät");

                                    break;
                                case 6:
                                    System.out.println("Šest");

                                    break;
                                case 7:
                                    System.out.println("Sedem");

                                    break;
                                case 8:
                                    System.out.println("Osem");

                                    break;
                                case 9:
                                    System.out.println("Devat");

                                    break;
                                case 0:
                                    System.out.println("Nula");

                                    break;

                            } }

                        break;

              }
            case 4:
                Scanner s5 = new Scanner(System.in);
                int n5 = s5.nextInt();
                LinkedList<Integer> stack = new LinkedList<Integer>();

                while (n5 > 0) {
                    stack.push( n5 % 10 );
                    n5 = n5 / 10;



                }
                while (!stack.isEmpty()) {
                    int v = stack.size();
                    if(v == 4){
                        switch ((stack.pop())) {
                            case 1:
                                System.out.print("Jeden");

                                break;
                            case 2:
                                System.out.print("Dva");

                                break;
                            case 3:
                                System.out.print("Tri");

                                break;
                            case 4:
                                System.out.print("Styri");

                                break;
                            case 5:
                                System.out.print("Pät");

                                break;
                            case 6:
                                System.out.print("Šest");

                                break;
                            case 7:
                                System.out.print("Sedem");

                                break;
                            case 8:
                                System.out.print("Osem");

                                break;
                            case 9:
                                System.out.print("Devat");

                                break;
                            case 0:
                                break;

                        }
                        System.out.print(" Tisic ");
                    }


                    else{
                        switch(v) {
                            case 7:
                                switch ((stack.pop())) {
                                    case 1:
                                        System.out.print("Milion ");

                                        break;
                                    case 2:
                                        System.out.print("Dve Miliony ");

                                        break;
                                    case 3:
                                        System.out.print("Tri Miliony ");

                                        break;
                                    case 4:
                                        System.out.print("Styri Miliony ");

                                        break;
                                    case 5:
                                        System.out.print("Pät Milionov ");

                                        break;
                                    case 6:
                                        System.out.print("Šest Milionov ");

                                        break;
                                    case 7:
                                        System.out.print("Sedem  Milionov ");

                                        break;
                                    case 8:
                                        System.out.print("Osem  Milionov ");

                                        break;
                                    case 9:
                                        System.out.print("Devat  Milionov");

                                        break;
                                    case 0:
                                        System.out.print("Milión");
                                        break;

                                }
                                break;
                            case 6:
                                switch ((stack.pop())) {
                                    case 1:
                                        System.out.print("Sto");

                                        break;
                                    case 2:
                                        System.out.print("Dvesto");

                                        break;
                                    case 3:
                                        System.out.print("Tristo");

                                        break;
                                    case 4:
                                        System.out.print("Styristo");

                                        break;
                                    case 5:
                                        System.out.print("Pätsto");

                                        break;
                                    case 6:
                                        System.out.print("Šeststo");

                                        break;
                                    case 7:
                                        System.out.print("Sedemsto");

                                        break;
                                    case 8:
                                        System.out.print("Osemsto");

                                        break;
                                    case 9:
                                        System.out.print("Devatsto");

                                        break;
                                    case 0:
                                        break;

                                }

                                break;
                            case 5:
                                switch ((stack.pop())) {
                                    case 1:
                                        switch ((stack.pop())){
                                            case 1:
                                                System.out.print("Jedenasť");
                                                break;
                                            case 2:
                                                System.out.print("Dvanást");
                                                break;
                                            case 3:
                                                System.out.print("Trinasť");
                                                break;
                                            case 4:
                                                System.out.print("Strnást");
                                                break;
                                            case 5:
                                                System.out.print("Patnast");
                                                break;
                                            case 6:
                                                System.out.print("Sestnast");
                                                break;
                                            case 7:
                                                System.out.print("Sedemnast");
                                                break;
                                            case 8:
                                                System.out.print("Osemnast");
                                                break;
                                            case 9:
                                                System.out.print("Devatnast");
                                                break;
                                        }

                                        break;
                                    case 2:
                                        System.out.print("Dvadsať");

                                        break;
                                    case 3:
                                        System.out.print("Tridsat");

                                        break;
                                    case 4:
                                        System.out.print("štyridsať");

                                        break;
                                    case 5:
                                        System.out.print("päťdesiat");

                                        break;
                                    case 6:
                                        System.out.print("Sestdesiat");

                                        break;
                                    case 7:
                                        System.out.print("Sedemdesiat");

                                        break;
                                    case 8:
                                        System.out.print("Osemdesiat");

                                        break;
                                    case 9:
                                        System.out.print("Devatdesiat");

                                        break;

                                }
                                break;

                            case 3:
                                switch ((stack.pop())) {
                                    case 1:
                                        System.out.print("Sto");

                                        break;
                                    case 2:
                                        System.out.print("Dvesto");

                                        break;
                                    case 3:
                                        System.out.print("Tristo");

                                        break;
                                    case 4:
                                        System.out.print("Styristo");

                                        break;
                                    case 5:
                                        System.out.print("Pätsto");

                                        break;
                                    case 6:
                                        System.out.print("Šeststo");

                                        break;
                                    case 7:
                                        System.out.print("Sedemsto");

                                        break;
                                    case 8:
                                        System.out.print("Osemsto");

                                        break;
                                    case 9:
                                        System.out.print("Devatsto");

                                        break;
                                    case 0:
                                        break;

                                }
                                break;
                            case 2:
                                switch ((stack.pop())) {
                                    case 1:
                                        switch ((stack.pop())){
                                            case 1:
                                                System.out.print("Jedenasť");
                                                break;
                                            case 2:
                                                System.out.print("Dvanást");
                                                break;
                                            case 3:
                                                System.out.print("Trinasť");
                                                break;
                                            case 4:
                                                System.out.print("Strnást");
                                                break;
                                            case 5:
                                                System.out.print("Patnast");
                                                break;
                                            case 6:
                                                System.out.print("Sestnast");
                                                break;
                                            case 7:
                                                System.out.print("Sedemnast");
                                                break;
                                            case 8:
                                                System.out.print("Osemnast");
                                                break;
                                            case 9:
                                                System.out.print("Devatnast");
                                                break;
                                        }

                                        break;
                                    case 2:
                                        System.out.print("Dvadsať");

                                        break;
                                    case 3:
                                        System.out.print("Tridsat");

                                        break;
                                    case 4:
                                        System.out.print("štyridsať");

                                        break;
                                    case 5:
                                        System.out.print("päťdesiat");

                                        break;
                                    case 6:
                                        System.out.print("Sestdesiat");

                                        break;
                                    case 7:
                                        System.out.print("Sedemdesiat");

                                        break;
                                    case 8:
                                        System.out.print("Osemdesiat");

                                        break;
                                    case 9:
                                        System.out.print("Devatdesiat");

                                        break;

                                }
                                break;
                            case 1:
                                switch ((stack.pop())) {
                                    case 1:
                                        System.out.print("Jeden");

                                        break;
                                    case 2:
                                        System.out.print("Dva");

                                        break;
                                    case 3:
                                        System.out.print("Tri");

                                        break;
                                    case 4:
                                        System.out.print("Styri");

                                        break;
                                    case 5:
                                        System.out.print("Pät");

                                        break;
                                    case 6:
                                        System.out.print("Šest");

                                        break;
                                    case 7:
                                        System.out.print("Sedem");

                                        break;
                                    case 8:
                                        System.out.print("Osem");

                                        break;
                                    case 9:
                                        System.out.print("Devat");

                                        break;
                                    case 0:
                                        break;
                                }
                                break;
                            default:
                                throw new IllegalStateException("Uveďte iba 6 miestne čislo, nie: " + v +"miestne");
                        }
                    }
                }
                System.out.println(" ");

              break;

            case 3:
                System.out.println("1=IF ELSE 2= SWITCH" );
                Scanner s6 = new Scanner(System.in);
                int n6 = s6.nextInt();
                switch (n6){
                    case 1:
                        Date day = new Date();
                        int Den = day.getDay();
                        System.out.println("1=Podla Realneho date 2=Vložte");
                        Scanner s7 = new Scanner(System.in);
                        int n7 = s7.nextInt();
                        switch (n7){
                            case 1:
                                System.out.println("podla IRL je:" );
                                System.out.println(Den);

                                if (Den == 1) {
                                    System.out.println("Pondelok");
                                } else if (Den == 2) {
                                    System.out.println("Utorok");
                                } else if (Den == 3) {
                                    System.out.println("Streda");
                                } else if (Den == 4) {
                                    System.out.println("Štrtok");
                                } else if (Den == 5) {
                                    System.out.println("Piatok");
                                } else if (Den == 6) {
                                    System.out.println("Sobota");
                                } else if (Den == 7) {
                                    System.out.println("Nedela");
                                }

                                break;
                            case 2:
                                System.out.println("Vložte cislo dna (0=Pondelok)");
                                Scanner s8 = new Scanner(System.in);
                                int n8 = s8.nextInt();
                                if (n8 == 0) {
                                    System.out.println("Pondelok");
                                } else if (Den == 1) {
                                    System.out.println("Utorok");
                                } else if (Den == 2) {
                                    System.out.println("Streda");
                                } else if (Den == 3) {
                                    System.out.println("Štrtok");
                                } else if (Den == 4) {
                                    System.out.println("Piatok");
                                } else if (Den == 5) {
                                    System.out.println("Sobota");
                                } else if (Den == 6) {
                                    System.out.println("Nedela");
                                }

                                break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + n0);
                        }

                        break;

                    case 2:
                        Date day1 = new Date();
                        int Den1 = day1.getDay();
                        System.out.println("1=Podla Realneho date 2=Vložte");
                        Scanner s9 = new Scanner(System.in);
                        int n9 = s9.nextInt();
                        switch (n9) {
                            case 1:
                                System.out.println("Podla IRL je:");
                                System.out.println(Den1);
                                switch (Den1) {
                                    case 1:
                                        System.out.println("Pondelok");

                                        break;
                                    case 2:
                                        System.out.println("Utorok");

                                        break;
                                    case 3:
                                        System.out.println("Streda");

                                        break;
                                    case 4:
                                        System.out.println("Stvrtok");

                                        break;
                                    case 5:
                                        System.out.println("Piatok");

                                        break;
                                    case 6:
                                        System.out.println("Sobota");

                                        break;
                                    case 7:
                                        System.out.println("Nedela");

                                        break;



                                }
                                break;

                            case 2:

                                System.out.println("Vložte cislo dna (1=Pondelok)");
                                Scanner s10 = new Scanner(System.in);
                                int n10 = s10.nextInt();
                                switch (n10) {
                                    case 1:
                                        System.out.println("Pondelok");

                                        break;
                                    case 2:
                                        System.out.println("Utorok");

                                        break;
                                    case 3:
                                        System.out.println("Streda");

                                        break;
                                    case 4:
                                        System.out.println("Stvrtok");

                                        break;
                                    case 5:
                                        System.out.println("Piatok");

                                        break;
                                    case 6:
                                        System.out.println("Sobota");

                                        break;
                                    case 7:
                                        System.out.println("Nedela");
                                        break;


                                }
                        }
                }
         }
        }

    }


}
