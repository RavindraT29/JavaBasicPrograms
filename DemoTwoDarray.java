import java.util.Scanner;
class TwoDarray{
int a[][]=new int [3][3];
void getData(){
Scanner sc=new Scanner(System.in);
int i,j;
 i=j=0;
for(i=0;i<3;i++)
  for(j=0;j<3;j++){
  System.out.println("Enter No:");
   a[i][j] = sc.nextInt();

 }

}
 void putData(){
  int i,j;
  i=j=0;
 for(i=0;i<3;i++){
 for(j=0;j<3;j++){
 System.out.println(a[i][j]+"----");

}
System.out.println();

}

}

}
class DemoTwoDarray{
public static void main(String args[]){
TwoDarray obj= new TwoDarray();
  obj.getData();
  obj.putData();


}

}