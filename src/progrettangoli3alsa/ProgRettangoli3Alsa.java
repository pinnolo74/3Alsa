package progrettangoli3alsa;

public class ProgRettangoli3Alsa {

    public static void main(String[] args) {
        int N=3,i;
        float max;
        Rettangolo Figure[]=new Rettangolo[N]; //creazione array di oggetti
        
        //ciclo per creare i rettangoli e agganciarli all'array di oggetti
        for(i=0;i<N;i++){
            Figure[i]=new Rettangolo();
        }
        //scansione dell'array di oggetti e invocazione per ogni oggetto del metodo calcolo perimetro
        for(i=0;i<N;i++){
            
            System.out.print("il perimetro del rettangolo "+(i+1)+" vale ");
            System.out.println(Figure[i].calcoloPerimetro());
        }
        //algoritmo ricerca massimo
        max=Figure[0].calcoloArea();
        for(i=1;i<N;i++){
            if(Figure[i].calcoloArea()>max)
                max=Figure[i].calcoloArea();
            }
        System.out.println("la massima area vale "+max);
    }
    
}
