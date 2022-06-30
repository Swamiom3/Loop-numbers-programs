import java.util.*;
    class Reversnum {

       public static void main(String[]args) {
 
          Scanner sc=new Scanner(System.in);

          System.out.println("ENTER YOUR NUMBER");
           int n=sc.nextInt();

         int i=1,rem=0,rev=0;
          i=n;

         while(i!=0)

         {

          
         rem=i%10;
         rev=rev*10+rem;


         i=i/10;


         }
         
          System.out.print(" "+rev);

     }
  }
         

