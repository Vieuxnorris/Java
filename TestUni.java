// programme qui permet de voir le tableau unicode de Java
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 07/02/2019
public class TestUni
{
    public static void main(String[] args)
    {
        final char carDeb = 200, carFin = 300; // variable symbolique de début et fin
        char c;
        for (c=carDeb;c<carFin;c++)
        {
            System.out.print((int)c + "==>"); // affiche en nombre la variable c + une fléche "==>"
            System.out.println(c + " "); // transforme le nombre en caractère.
        }
    }
}
