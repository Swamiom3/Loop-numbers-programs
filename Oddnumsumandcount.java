import java.util.*;

    class Oddnumsumandcount
      {
        public static void main(String[]args)
         {
          Scanner sc=new Scanner(System.in);
          System.out.println("ENTER UPTO YOU HAVE EVEN NUM SUM AND COUNT ");

          int n=sc.nextInt();
          int i=1,c=0,sum=0;

             while(i<=n)
              {
               if(i%2==1)
              { sum=sum+i;
                
                
                c++;}
                
                i++;
              }
                   
                   System.out.println(" "+c);
                   System.out.println(" "+sum);
         }
      }
