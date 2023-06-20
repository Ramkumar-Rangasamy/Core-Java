class Divisible{

public static void main(String[] args){

  System.out.println("Divided by 3 :\n");

for(int i=1; i<=100; i++){

 if(i%3==0){
    System.out.print(i+",");
  }
 }



  System.out.println("\n\n"+"Divided by 5 : \n");

for(int i=1; i<=100; i++){

 if(i%5==0){
    System.out.print(i + ",");
 }
}

  System.out.println("\n\n"+"Divided by 3 & 5 :\n");

for(int i=1; i<=100; i++){
 
  if(i%3==0 && i%5==0){

  System.out.print(i+",");
  }
}

}
}