interface Kgm{

       int students=5;

   void development();


}

class Kgisl{

   static void arts(){
     
      System.out.println("From arts in KGiSL");
   }

   void engineering(){

      System.out.println("From engineering in KGiSL");
   }
   
}

interface Kgcas{

   void bsc();
}

class College extends Kgisl implements Kgm,Kgcas{
   
 static void wl(){
   System.out.println("Wlcome to interface multiple inheritance");
 }

 public void development(){
       College r=new College();
     System.out.println(r.students+" Students From development in KGiSL");
 }
 
 public void bsc(){

     int boys=40;
     int grils=60;
     int totalcount=boys+grils;
     System.out.println("TotalStudents="+totalcount+" From development in KGiSL");

 }

 public static void main(String[] args){
                    wl();
          College total=new College();
                  total.development();
                  total.arts();
                  total.engineering();
                  total.bsc();


 }

}