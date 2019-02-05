// programme qui permet de faire la racine d'un nombre
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 05/02/2019
import java.util.*; // import tout les modules de l'objet java.util
public class Racine {
    public static void main (String[] args)
    {
        final int NFOIS = 5; // final--> met une variable en symbolique (ne peux pas être modifier durant le programme)
        int i;
        double x;
        double racx;

        Scanner sc = new Scanner(System.in); // fonction qui permet de prendre en compte les entrées clavier

        System.out.println ("Bonjour");
        System.out.println ("Je vais vous calculer " + NFOIS + " racines carrees");

        for (i=0 ; i<NFOIS ; i++) // boucle qui permet de rentrer 5 nombres
        { System.out.print ("Donnez un nombre : ");
            x  = sc.nextDouble(); // scan une valeur de type double du clavier
            if (x < 0.0) // condition  qui resort une réponse du moment que le nombre et en dessous de 0 
			{
                System.out.println (x + " ne possede pas de racine carree");
            }
            else // sinon il resort cette réponse
            {
                racx = Math.sqrt(x);
                System.out.println (x + " a pour racine carree : "  + racx);
            }
        }
        System.out.println ("Travail termine - Au revoir"); // message de fin de programme une fois les 5 nombre entré
    }
}
