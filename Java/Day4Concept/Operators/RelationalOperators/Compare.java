import java.util.Scanner;

class Compare{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);

System.out.println("Input first integer : ");

int a=sc.nextInt();

System.out.println("Input Second integer : ");

int b=sc.nextInt();

if(a!=b){

System.out.println(a+" != "+b);
}else{

System.out.println("Values are not Match");
}

if(a<b){

System.out.println(a+" < "+b);
}else{

System.out.println("Values are not Match");
}


if(a<=b){

System.out.println(a+" <= "+b);
}else{

System.out.println("Values are not Match");
}


}
}