// programme qui montre une convertion forcé
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 14/02/2019
public class ErrAffEl
{
    public static void main(String args[])
    {
        byte b = 10;
        int n = 10000;
        b += n; // comparable a un "b = (byte) (b+n)"
        System.out.println("b = " + b);
    }
}
