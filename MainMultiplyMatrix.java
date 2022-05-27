import java.util.Scanner;
class MultiplyMatrix{
 int a[][]=new int[3][3];
 int b[][]=new int[3][3];
 int c[][]=new int[3][3];
  int i,j;
 void getdata(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Element for Matrix A:");

 for(i=0;i<3;i++)
  for(j=0;i<3;j++){
   System.out.println("Enter No:");
    a[i][j]=sc.nextInt();
    
}
  for(i=0;i<3;i++)
  for(j=0;i<3;j++){
   System.out.println("Enter No:");
    b[i][j]=sc.nextInt();
  }
  void putData(){
  System.out.println("First Matrix is:");
   for(i=0;i<3;i++)
   {
    for(j=0;j<3;j++)
      System.out.println("a[i][j]+"----");
     
     System.out.println();
}
  void multiply(){
  int k;
   for(i=0;i<3;i++)
      for(j=0;j<3;j++)
     {
       c[i][j]=0; 

      for(k=0;k<3;k++)
      c[i][j]=c[i][j]+a[j][k]*b[k][j];      
}
 System.out.println("Multiplication is:");
  for(i=0;i<3;i++){
  for(j=0;j<3;j++))
    System.out.println("c[i][j]+"----");
 
}

}
}

}
}  

}
class MainMultiplyMatrix{
public static void main(String args[]){
  MultiplyMatrix obj= new MultiplyMatrix();
   obj.getdata();
   obj.putData();
   obj.multiply(); 

}

}