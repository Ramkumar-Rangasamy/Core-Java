public class StringMethodExample{

 public static void main(String[] args){

 String st1="Batch 14 is toxic";
 

 
  //System.out.println(st1.valueOf());
   
   System.out.println(st1);

   System.out.println("using in charAt() :"+st1.charAt(7));

   System.out.println("using in concat() :"+st1.concat(",but not / oin two string"));

   System.out.println("using contains() method [true] :"+ st1.contains("toxic"));
   System.out.println("using contains() method [false] :"+ st1.contains("TOXIC"));

  
   System.out.println("using equals() method [true] :"+ st1.equals("Batch 14 is toxic"));
   System.out.println("using equals() method [false] :"+ st1.equals("  Batch 14 is toxic  "));


   System.out.println("using equalsIgnoreCase() method true :"+ st1.equalsIgnoreCase("BatcH 14 is Toxic"));


   System.out.println("using in toLowerCase() method :"+st1.toLowerCase());
   System.out.println("using in toUpperCase() method:"+st1.toUpperCase());


   System.out.println("using in length()  method :"+st1.length());

    String str4="     Batch 14 is toxic   ";
    System.out.println("using in trim() method :"+str4.trim());

    

   System.out.println("using in isEmpty(value is present) method : "+st1.isEmpty());
   String str45="";
   System.out.println("using in isEmpty(vlaue is absent) method : "+str45.isEmpty());

   String st123="Batch 14 is toxic";
   System.out.println("using in replace() method : "+st123.replace("toxic"," NOT TOXIC"));


   System.out.println("using in substring() method : "+st1.substring(2,6));

   System.out.println("using in indexof() method : "+st1.indexOf("i"));
      System.out.println("using in indexof() method : "+st1.indexOf("14"));


   System.out.println("using in join() method : "+st1.join("-",st1,st1));
      System.out.println("using in join() method : "+st1.join("-","name","password","email"));


   System.out.println("using in compareTo() method : "+st1.compareTo("Batch 14 is toxiC"));


   System.out.println("using in compareToIgnoreCase() method : "+st1.compareToIgnoreCase("Batch 14 is toxic"));

   System.out.println("using in hashCode() method : "+st1.hashCode());

   System.out.println("using in lastIndexOf() method : "+st1.lastIndexOf("is"));
  
   System.out.println("using in format() method : "+st1.format("%s",20)); 
  
 


  
   


 }
    
}
