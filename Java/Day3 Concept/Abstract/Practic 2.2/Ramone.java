abstract class KGM{

  public static void imp(){
   
    System.out.println("Welcome To Abstract Method...");
 }


 abstract  void development();
 abstract  void fullStackDevelopment();

}


class Ramone extends KGM{

  void development(){
       System.out.println(" From Development in KGiSL");
  }


  void fullStackDevelopment(){
       System.out.println(" From FullStack Development  in KGiSL");
  }


public static void main(String[] args){
        imp();
  Ramone y=new Ramone();

     y.fullStackDevelopment();
     y.development();     
}
}

