// Q25.Wap enter 5 digits no and print only even no.


import java.util.*;

   class Printevenfromnumber

     {
        public static void main(String[]args)

        {

         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER YOUR NUMBER");
          int n=sc.nextInt();

         int i=1; int rem=0; int c=0;

           while(i<=n){

           rem=n%10;
            if(i%2==0)
            c++;
           
          


           i=i/10;

           } System.out.println(" "+i);

            

            
       }
   }
            

           



         