/*Q7. Write a program to find sum of all natural numbers between 1 to n.*/
import java.util.*;

  class Sumupton

   {
      public static void main(String[]args)

      {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER upto to type number");
        int n=sc.nextInt();
        int i=1; int sum=0;

        while(i<=n)
        {
         sum=sum+i;
       
        i++;
        }
        System.out.println(" TOTAL: " +sum);
 
      }
   }
        
        

        