import java.util.Scanner;
class AddationMatrix{
int a[][] = new int [3][3];
int b[][] = new int [2][3];
int c[][] = new int [3][3];
void getData(){
Scanner sc=new Scanner(System.in);
int i,j;
i=j=0;
for(i=0;i<3;i++)
  for(j=0;i<3;j++){
  System.out.printn("Enter No:");
  a[i][j]=sc.nextInt();

}
for(i=0;i<3;i++)
  for(j=0;j<3;j++){
  System.out.println("Enter No:");
  b[i][j]=sc.nextInt();
} 
 void add(){
   int i,j;
   i=j=0; 
  for(i=0;i<3;i++)
    for(j=0;j<3;j++)
     c[i][j]=a[i][j]+b[i][j];
}
 void putdata(){
 int i,j;
  i=j=0;
  for(i=0;i<3;i++){
  for(j=0;i<3;j++)
     System.out.print(c[i][j]+"-----");
     
     System.out.println();
}
    

}

}

}
class EddationMatrixMain{

public static void main(String args[]){
 AddationMatrix obj= new AddationMatrix();
  obj.getData();
  obj.add();
  obj.putdata();
}

}