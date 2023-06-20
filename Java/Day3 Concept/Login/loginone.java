class Login{
	 
   private  String Uname;
   private  String Password;
      
	public void setName(String name){
		 this.Uname=name;
	}
	
	public String getName (){
		
		
	 return Uname;	
	}


	public void setpass(String Password){
		 this.Password=Password;
	}
	
	public String getpass (){
		
		
	 return Password;	
	}
	
}


class Loginone extends Login{
	
	public static void main(String[] args){
		Loginone u=new Loginone();
		         u.setName("KGM");
	     String y=u.getName();
	     System.out.println(y);
		         u.setpass("KGM@123");
	     String x=u.getpass();
	     System.out.println(x);
		
	}
		
}