import java.util.*;

  class Oddnum

   {
      public static void main(String[]args)

      {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER upto to type number");
        int n=sc.nextInt();
        int i=1; 

           while(i<=n)
           {
           
            if(i%2==1)
            
            
            System.out.println(" "+i);
            i++;
           }
       }
   }


        