import java.util.Scanner;

public class Userinput{
 
 

public static void main(String[] args){

   String emailId;

   long phoneNumber;
  
 Scanner sc= new Scanner(System.in);
 

      System.out.println("Enter the mailID ");

            emailId=sc.nextLine();

      System.out.println("Gmail-ID "+emailId+"@gmail.com");
      
      
      System.out.println("Enter the phonenumber");
 
           phoneNumber=sc.nextLong();

     

        if(phoneNumber==10){

           System.out.println(phoneNumber+" "+"This Number successfully");

        }else{
           System.out.println("Sry Try Again Please");
        }
          
 
      
          

 
      
     

}




}