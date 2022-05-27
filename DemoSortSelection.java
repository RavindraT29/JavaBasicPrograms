import java.util.Scanner;
class SortSelection{
int a[]=new int[10];
void getData(){
 Scanner sc=new Scanner(System.in);
 int i;
 for(i=0;i<10;i++){
  System.out.println("Enter No:");
  a[i]=sc.nextInt();  
}
 
}
void putData(){
  int i;
  for(i=0;i<10;i++)
    System.out.println(a[i]);

}
  void sort(){
   int i,j,t;
   for(i=0;i<9;i++)
     for(j=i+1;j<10;j++){

      if(a[i]>a[j]){
        t=a[i];
        a[i]=a[j];
        a[j]=t;
}

}
     
}

}
class DemoSortSelection{
  public static void main(String args[]){
   SortSelection obj= new SortSelection();
   obj.getData();
   System.out.println("Unsorted Array:");
   obj.putData();
   System.out.println("Sorted Array is:");
   obj.sort();
   
}

}