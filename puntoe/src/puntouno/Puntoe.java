

import java.util.Scanner;  

public class Puntouno
{  
   public static void main(String[] args)
   {  
        Scanner numero = new Scanner(System.in);  
        int num,i,n;
        n=4;
        String cad="";  
        System.out.println("Ingrese un numero:");  
        num=numero.nextInt();  
        if(num>2)
        {  
            cad="2,3";  
            for(int a=2;a<num;a++)
            {  
                i=2;  
                while(i<=n)
                {  
                    if(i==n)
                    {  
                        cad=cad+","+n;  
                        a++;  
                    }
                    else
                    {  
                        if(n % i==0){  
                            i=n;  
                        }  
                    }  
                    i=i+1;  
                }  
                n=n+1;  
            }  
            System.out.println(cad);  
        }          
    }  
}  