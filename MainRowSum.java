import java.util.Scanner;
class RowSum{
  int a[][]=new int[3][3];
  int i,j;

  void getData(){
  Scanner sc=new Scanner(System.in);
  for(i=0;i<3;i++)
   for(j=0;i<3;j++){
    System.out.println("Enter No:");
     a[i][i]=sc.nextInt();
}

}
 void putData(){
 for(i=0;i<3;i++){
 for(j=0;j<3;j++){
   System.out.println(a[i][j]+"----");

  System.out.println();

}

}
   
}
 void rowSum(){
  int sum=0;
   for(i=0;i<3;i++){
   sum=0;
 for(j=0;j<3;j++){
   sum=sum+a[i][j];
}
 System.out.println("Sum of"+ i+1+"row="+sum);
}

}

}
class MainRowSum{
public static void main(String args[]){

RowSum b=new RowSum();
b.getData();
System.out.println("The martrix is:");
b.putData();
b.rowSum();
}

}