
package tallerrepositorio;
import java.util.Scanner;
public class TallerRepositorio {

    public static void main(String[] args) {
        // 
         int num,res;
        int a,b,c;
        
        Scanner Input = new Scanner (System.in);
        System.out.print("Digite un número con tres cifras:");
        num =Input.nextInt();
        
        a = num / 100;
        res = num % 100;
        b = res / 10;
        c = res % 10;
        if (num>100 && num< 1000  || num<-100 && num>-1000)
        {
            if (a==b && a ==c && b ==c)
            {
              System.out.println("Los tres numeros son iguales");  
            }
            else
            {
                  if (a ==b || a ==c || b ==c || c== a )
                  {
                  System.out.println("Dos de los digitos se parecen");
                   }
                   else
                   {
                   System.out.println("Ningun digito se parece");   
                   }
            }
           
            
        }
        else
        {
             System.out.println("ERROR");
        }
        
    }
    
}
