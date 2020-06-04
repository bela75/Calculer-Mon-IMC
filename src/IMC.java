import org.testng.annotations.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public
class IMC {

       protected double size;
       protected double weight;
       protected Scanner sc = new Scanner ( System.in );

        IMC(){
            try{
                System.out.println ("Renseigner votre taille");
                size = sc.nextDouble ();
                System.out.println ("Renseigner votre poids");
                weight = sc.nextDouble ();
            }
            catch (InputMismatchException exception){
                System.out.println ();
                System.out.println ("************************************************************************");
                System.out.println ("Une exception est survenue lors de la saisie de la taille ou du poids");
                System.out.println ("Exception : "+exception);
                System.out.println ("Vous avez saisie des lettres a la place des chiffres");
                System.out.println ("************************************************************************");
                System.out.println ();
            }

    }
    @Test
    public double caculeIndiceMasseCorporelle(){
        double total = weight /  Math.pow (size, 2);
        total = total * 10000;
        return total;
    }
    @Test
    public
    static void correspond( double indice){
            if(indice < 16.5){
                System.out.println ("Vous êtes en dénutrition");
            }
            else if(16.5 < indice && indice < 18.5){
                System.out.println ("Vous êtes en Maigre");
            }
            else if(18.5< indice && indice  < 25){
                System.out.println ("Vous êtes en corpulence normale");
            }
            else if(25 < indice && indice  < 30){
                System.out.println ("Vous êtes en surpoids");
            }
            else if(30 < indice && indice  < 35){
                System.out.println ("Vous êtes en obésité modérée");
            }
            else if(35 < indice && indice  < 40){
                System.out.println ("Vous êtes en obésité sévère");
            }
            else if(indice > 40){
                System.out.println ("Vous êtes en obésité morbide");
            }
    }
    //
    @Test
    public void affichageResultat(){
            double indice = caculeIndiceMasseCorporelle();
            System.out.print ("Votre Indice de masse corporelle est de : ");
            System.out.format ("%2f\n",indice);
            correspond(indice);
    }
}
