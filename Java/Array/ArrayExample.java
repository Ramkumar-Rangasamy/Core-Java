class ArrayExample{

public static void main(String[] args){
 
      int a[]={21,45,34,56,78,32,42,24,2,23,12,43,23,23};

      int min=a[0];
      int max=a[0];


   for(int i=1; i<a.length; i++){
      
       if(a[i]<min){

           min=a[i];
       }

       if(a[i]>max){
      
         max=a[i];
       }
   }
    System.out.println("minimum :"+ min +" "+ "maximum :"+max);
}

}