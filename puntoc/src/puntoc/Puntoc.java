

import java.util.Scanner;

public class Puntoc
{
    public static void main(String[] args)
    {
        Scanner numero = new Scanner(System.in);
        int num;
        double cantidad=0,promedio=0,suma=0;
        do
        {
            num = numero.nextInt();
            suma = suma + num;
            cantidad++;
        }while(num!=9999);
        suma = suma - 9999;
        promedio = suma/cantidad;
        System.out.println("El promedio es: "+promedio);
    }
}
