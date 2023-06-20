class Human{

private int age;
private String name;

      //get age
 public int getAge(){
   
    return age; 
 }
     //set age
 public void setAge(int agename){
  
   this.age=agename;
 }



     //get name
 public String getname(){

   return name;
 }
     
     // set nmae
 public  void setname(String names){

   this. name=names;
 }
 }
class EnSubclass{


public static void main(String[] args){

   Human obj=new Human();
         obj.setAge(22);
         obj.setname("ramkumar");

 System.out.println(obj.getAge() + ":" + obj.getname());
   

}


}