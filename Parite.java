// programme qui test si un nombre est pair ou impair selon le bit
// fait par **Julien Wins** et **Gordon Freeman**
// Fait le 14/02/2019
import java.util.*;
public class Parite
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("donnez un entier : ");
        n = sc.nextInt();
        if((n & 1) == 1) // test la condition pour savoir si le dernier bit du nombre est 1
        {
            System.out.println("il est impair");
        }
        else // si le dernier bit du nombre est 0
        {
            System.out.println("il est pair");
        }
    }
}
