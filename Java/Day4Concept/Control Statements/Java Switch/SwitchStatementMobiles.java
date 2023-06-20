import java.util.Scanner;

class SwitchStatementMobiles{

public static void main(String[] args){


    Scanner sc=new Scanner(System.in);


   System.out.println("Enter your Mobile Brand");

   String mobile=sc.nextLine();

  switch(mobile){

   case samsung:
     System.out.println("Samsung Phones is Available sir/madam");
     break;

   case apple:
     System.out.println("Apple Phones is Available sir/madam");
     break;

   case oppo:
     System.out.println("OPPO Phones is Available sir/madam");
     break;
   
   case redmi:
     System.out.println("RED-MI Phones is Available sir/madam");
     break;

   default:
      System.out.println("Sorry sir/madam this Brand mobile phone not available");
      break;

  }



}


}