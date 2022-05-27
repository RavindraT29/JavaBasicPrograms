import java.util.Scanner;
class Frequency{
  int a[] = new int[10];
  int key;
 void getData(){
   Scanner sc= new Scanner(System.in);
   int i;
   for(i=0;i<=10;i++){
    System.out.println("Enter No:");
    a[i]=sc.nextInt();

}
System.out.println("Enter No to find Freq:");
key=sc.nextInt();
} 
 
 void countD(){
    int i,count=0;
   for(i=0;i<=10;i++){
     if(a[i]==key)
      count= count+1;

}
 System.out.println("frequency="+count);

} 

}
class DemoFrequency{
public static void main(String args[]){
Frequency obj= new Frequency();
          obj.getData();
          obj.countD();

}


}