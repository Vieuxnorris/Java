// programme montre le manque de précision au moment d'une convertion d'un int en float
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 14/02/2019
public class ErrConv
{
    public static void main(String args[])
    {
        int n;
        float x;

        n = 1234;
        x = n;
        System.out.println("n : " + n + " x : " + x);

        n = 123456789;
        x = n;
        System.out.println("n : " + n + " x : " + x);
    }
}
