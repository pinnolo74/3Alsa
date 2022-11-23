package progrettangoli3alsa;

import java.util.Scanner;

public class Rettangolo {
    private float base; //attributi privati
    private float altezza;
    Scanner in=new Scanner(System.in); //serve per input da tastiera

    //metodo costruttore
    Rettangolo(){
        System.out.println("inserisci la base");
        base=in.nextFloat();
        System.out.println("inserisci l'altezza");
        altezza=in.nextFloat();
    }
    //metodo pubblico per il calcolo dell'area
    public float calcoloArea(){
        return base*altezza;
    }
     //metodo pubblico per il calcolo del perimetro
    public float calcoloPerimetro(){
        return (base+altezza)*2;
    }
}
