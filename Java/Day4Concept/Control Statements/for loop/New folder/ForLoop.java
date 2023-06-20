import java.util.Scanner;

public class ForLoop{

//public static  int a=677;

//public  static int b=383;

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("enter the first value");

int a=sc.nextInt();

System.out.println("enter the secound value");

int b=sc.nextInt();

System.out.println("This is your value : ");

for(int i=1; i<=40; i++){

 if((a<=b || a>=b)&&(a>=b || a<=b)){
 
   System.out.print("succesfully");

 }else{

   System.out.print("sry try again");
 }



}

}
}