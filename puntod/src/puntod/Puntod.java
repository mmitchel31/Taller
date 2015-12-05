

import java.util.Scanner;

public class Puntod
{
    public static void main(String[] args)
    {
        Scanner valor = new Scanner(System.in);
        int monto;
        int retiro;
        int c1,c2,c3,c4,c5,c6;
        System.out.printf("Digite la suma de dinero que desea retirar: ");
        monto = valor.nextInt();
        
        c1 = monto/1000;
        c2 = monto/2000;
        c3 = monto/5000;
        c4 = monto/10000;
        c5 = monto/20000;
        c6 = monto/50000;
        
        if(c1<c2) System.out.println("Retire su dinero: "+c1);
            else if(c2<c3) System.out.println("Retire su dinero: "+c2);
                else if(c3<c4) System.out.printf("Retire su dinero: "+c3);
                    else if(c4<c5) System.out.printf("Retire su dinero: "+c4);
                        else if(c5<c6) System.out.printf("Retire su dinero: "+c5);
                            else System.out.printf("Retire su dinero: "+c6);
    }
}
