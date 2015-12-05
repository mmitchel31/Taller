

import java.util.Scanner;

public class Puntoa
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int a,b;
        int c;
        a = num.nextInt();
        b = num.nextInt();
        c = a%b;
        
        if((a%2)==0)
        {
            System.out.println(a+" Es par.");
        }
        else
        {
            System.out.println(a+" Es impar");
        }
        
        if((b%2)==0)
        {
            System.out.println(b+" Es par.");
        }
        else
        {
            System.out.println(b+" Es impar");
        }
        
        if(a>b)
        {
            System.out.println("El numero mayor es: "+a);
        }
        else
        {
            System.out.println("El numero mayor es: "+b);
        }
        
        if(c==0)
        {
            System.out.println(a+" es multiplo de "+b);
        }
        else
        {
            System.out.println(a+" no es multiplo de "+b);
        }
    }
}
