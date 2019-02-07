// programme qui test la convention IEEE754 des variables float
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 07/02/2019
public class IEEE754
{
    public static void main(String[] args)
    {
        float x = 1e30f;
        float y;
        y = x*x;

        System.out.println(x + " a pour carre : " + y);

        float zero = 0.f; // division flottante par zero
        float z = y/zero;
        System.out.println(y + " divise par 0 = " + z);
        y = 15;
        System.out.println(y + " divise par 0 = " + z);
    }
}
