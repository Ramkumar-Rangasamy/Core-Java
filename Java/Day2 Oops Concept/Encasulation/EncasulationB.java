class EncasulationA{

  //not using only private


  //String x="hello java";
  public int x=10;

    public static void main(String[] args){

        System.out.println(new EncasulationA().x);
    }
    
}


class  EncasulationB extends EncasulationA{


    public static void main(String[] args){

      EncasulationB y=new EncasulationB();  
        System.out.println(y.x);
    }
}
