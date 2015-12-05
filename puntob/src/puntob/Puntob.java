

import java.util.Scanner;

public class Puntob
{
    public static void main(String[] args)
        {
               Scanner numero = new Scanner(System.in);
               String num;
               int tamaño;
               num = numero.nextLine();
               tamaño = num.length();
               for(int i=0;i<=tamaño;i++)
               {
                   System.out.print(num.charAt(i)+"   ");
               }
        }    
}
