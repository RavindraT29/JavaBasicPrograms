import java.util.Scanner;
class Bubble{
int a[]=new int[10];
void getData(){
Scanner sc=new Scanner(System.in);
for(i=0;i<=10;i++){
System.out.println("Enter no:");
a[i]=sc.nextInt();

}

}
int i;
void putData(){
for(i=0;i<10;i++)
  System.out.println(a[i]);
}
void sort(){
int i,j,t;
for(i=0;i<10;i++){
for(j=0;j<9-1;j++){
if(a[j]>a[j+1]){
   t=a[j];
   a[j]=a[j+1];
   a[j+1]=t;

}

}

}

}

}

class DemoBubble{
public static void main(String args[]){
Bubble obj=new Bubble();
obj.getData();
System.out.println("Unsorted Arrays is:");
obj.putData();
System.out.println("sorted Arrays is:");
obj.sort();
obj.putData();


}

}

