class MatrixAdd{

 public static void main(String[] args){

  int rows[][]={{1,2},{3,4}};
  int columns[][]={{5,6},{7,8}};
	int a[][]=new int[2][2];
  



  for(int i=0; i<2; i++){

    for(int j=0; j<2; j++){
  a[i][j]=rows[i][j]+columns[i][j];


  System.out.print(a[i][j]+" ");

   }
System.out.println();
   }
}
}
