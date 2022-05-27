import java.util.Scanner;
class TransposeMatrix{
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
  void transPose(){
     System.out.println("Transpose is:");
       for(i=0;i<3;i++){
        for(j=0;j<3;j++)
           System.out.println(a[j][i]+"----");
        System.out.println();
}

}
}
class MainTransposeMatrix{
  public static void main (String args[]){

   TransposeMatrix obj= new TransposeMatrix();
    obj.getData();
    System.out.println("Origirnal Matrix:");
    obj.putData();
    obj.transPose();
}

}
