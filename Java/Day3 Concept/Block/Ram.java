class Super{


static{

   System.out.println("static block");
}
 
{

  System.out.println("Init block");
}

}

class Ram extends Super{


public static void main(String[] args){

  Ram r=new Ram();

}


}
