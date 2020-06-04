import java.util.Scanner;

public
class ResultatIMC {
    public static
    void main ( String[] args ) {

        char    choix        = 'n';
        int     count        = 0;
        Scanner saisiClavier = new Scanner ( System.in );
        IMC imc = new IMC ();
        imc.affichageResultat ();
        System.out.println ( "Souhaitez vous effctuer un autres calcule " );
        choix = saisiClavier.nextLine ().charAt ( 0 );
        while (choix == 'o' || choix == 'O') {
            imc   = new IMC ();
            imc.affichageResultat ();
            count = count + 1;
            System.out.println ( "Souhaitez vous effctuer un autres calcule " );
            choix = saisiClavier.nextLine ().charAt ( 0 );
        }
        System.out.println ("************************");
        System.out.println ("*** Fin du programme ***");
        System.out.println ("************************");
    }
}