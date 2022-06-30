import java.util.*;
class Vowel2
  {
        public static void main(String[]args)
         {
             Scanner sc=new Scanner(System.in);

            // System.out.println("ENTER YOUR CHARCTER");
            // char n=sc.next().charAt(0);

             int i=1;

                while(i!=0)
                 {System.out.println("ENTER YOUR CHARCTER");
             char n=sc.next().charAt(0);

                      switch(n)
                       {
                         case 'a':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");
                           break;
                           }
                         case 'e':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");
                           break;
                           }
                         case 'i':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");
                           break;
                           }
                        case 'o':
                           {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");
                           break;
                            }
                        case 'u':
                           {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");
                           break;
                           }

                        case 'A':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");break;
                           }
                        case 'E':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");break;
                           }
                       case 'I':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");break;
                          }
                       case 'O':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");break;
                          }
                       case 'U':
                          {
                           System.out.println("\n\n\t\t\tTHIS IS VOWEL");
                           System.out.println("\n\n\t\t\t==============");break;
                          }
                       default:
                         {
                           System.out.println("\n\n\t\t\tENTER THE CHARACTER IS NOT VOWEL");
                           
                         }
                         }                        
                           System.out.println("enter 0 for teminate and 1 for continue");
                           i=sc.nextInt();
             }
        }
 }