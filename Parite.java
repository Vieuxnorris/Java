import java.util.*;
public class Parite
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("donnez un entier : ");
        n = sc.nextInt();
        if((n & 1) == 1)
        {
            System.out.println("il est impair");
        }
        else
        {
            System.out.println("il est pair");
        }
    }
}
