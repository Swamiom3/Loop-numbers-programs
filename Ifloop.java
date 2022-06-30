/*Q16..WAP to add multiple  number, ask user to take  input as their need. 
   press 0 to terminate inputting after that calculate sum of that inputted number.*/

import java.util.*;

class Ifloop
    {
      public static void main(String[]args)

      {
               Scanner sc=new Scanner(System.in);

               System.out.printf("\t1:ADD \t\t2:MULTIPLICATION\n\t\tENTER YOUR CHOICE : ");
               int n=sc.nextInt();
               
               int i=1;
               
               System.out.printf("ENTER YOUR 1ST NUMBER : ");
               int a=sc.nextInt();
               System.out.printf("ENTER YOUR 2ND NUMBER : ");
               int b=sc.nextInt();
               int c=a+b;
               int d=a*b;
               
         while(i!=0)
         {
               
            

                switch(n)
                 {
                   case 1:
                   {
                  
                   System.out.println("\n\t\t\tTHIS IS YOUR ADDITION : "+c);
                   break;
                   }


                   case 2:
                   {
                   
                   System.out.println("\n\t\t\tTHIS IS YOUR ADDITION : "+d);
                   break;
                   }

                   default:
                   System.out.println("ENTER CORRECT CHOICE");
 
                }
                   
 
                   
                  
          } System.out.println("enter 0 for terminate and 1 for continue");
                     i=sc.nextInt();
           
      }

 }




                   

                  
                   
                     
                   
                


