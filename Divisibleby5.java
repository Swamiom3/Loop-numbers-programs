/*Q Wap enter a no and check it is
divisible by 5 or not?*/

import java.util.*;

class Divisibleby5
    {
        public static void main(String[]args)

        {
         Scanner sc=new Scanner(System.in);

          System.out.println("ENTER YOUR NUMBERS");
          int n=sc.nextInt();
     

         if(n%5==0)

           System.out.println("THE NUMBER IS DIVIDBLE BY 5");

         else
           System.out.println("NUMBER NOT DIVISIBLE BY 5");


          }
       }