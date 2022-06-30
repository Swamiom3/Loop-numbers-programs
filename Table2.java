/*Q17.Wap to take input a no and print table.*/

import java.util.*;

   class Table2
   {
      public static void main(String[]args)

    {
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER YOUR NUMBER TO GENERATE TABLE");
          int n=sc.nextInt();
          
         int i=1;

         while(i<=10)
         {
           
          System.out.println(" "+n*i);
          i++;
          }
     }
   }
         
         
