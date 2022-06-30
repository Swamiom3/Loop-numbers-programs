import java.util.*;

  class Factorial
    {
           public static void main(String[]args)
           
           {

             Scanner sc=new Scanner(System.in);
             System.out.println("enter your value");
             int n=sc.nextInt();

            int i=1; 
             while(i<n)
             {
            if(n%i==0)
             System.out.println("this is your factors : "+i);

             i++;


              }
  
           }
     }