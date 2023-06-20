class SuperClass{

 SuperClass(){
    
   System.out.println("Constructor from Super class");
 }

 SuperClass(float a){
      this();
   System.out.println("parameter Constructor from Super class");
 }
 
 public void m1(){

    System.out.println("non-static method from SuperClass");
 }
 
 
 
 
}




class Ram extends SuperClass{
   
   int a=200;
 Ram(){
     super(10.22f);
  System.out.println("empty Constructor from Ram class");
 }

 Ram(int a){
    this();
    Ram z=new Ram();
        int h=m4();
   System.out.println(h+z.a+"Reuse"); 
  System.out.println("parameter Constructor from Ram class");
 }

 public void m1(){
       super.m1();    
    System.out.println("overrideing Non static method from Ram Class");
 }
 
  void m1(long a){
        this.m1();
    System.out.println("parameter Non- static method from Ram Class");
 }

  static void m3(){

    System.out.println("static method from Ram Class");

 }

 static{
         
   System.out.println("static block");
 }
 
 {

  System.out.println("Init block");
 }
	
 static int m4(){

  return 100;
 }
 

 
public static void main(String[] args){

    System.out.println("Main Method from Ram class");
    Ram r=new Ram(20);
         r.m1(2345l);
          m3();
    int y=m4();
     System.out.println(y+r.a+"Reuse");
     
}


}