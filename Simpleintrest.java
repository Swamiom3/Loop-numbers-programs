// Q23.Wap take input of amount and rate and print simple interest of next 10 year continuously.



import java.util.*;

class Simpleintrest {
 
      public static void main(String[]args){
         
         Scanner sc=new Scanner(System.in);
        
       
       int i=1;
       while(i>=1) 
       {
     
       int year=i;
          

        System.out.println("ENTER YOUR TIME SPAN");
         year=sc.nextInt();
         
           System.out.printf("ENTER YOUR PRICIPAL AMOUNT");
           int Pa=sc.nextInt();
  
           System.out.printf("ENTER YOUR RATE OF INTRST");
           int r=sc.nextInt();
           
            
           int si=(Pa*r*i)/100;

           int Tp=si+Pa;
       
        
              {
               System.out.println("THIS IS YOUR 1ST YEAR SI " +si);
               System.out.println("THIS IS YOUR 1ST YEAR SI " +Tp);


          }
              System.out.println("enter 0 for terminate 1 for continue");
               i=sc.nextInt();
}
}
    }        

           

    