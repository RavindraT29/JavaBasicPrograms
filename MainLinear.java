import java.util.Scanner;
class Linear{
int a[] = new int[10]; int key;

void getData(){
Scanner sc= new Scanner(System.in);
int i;
for(i=0; i<=10;i++){
System.out.println("Enter No:");
a[i]=sc.nextInt();
}
System.out.println("Enter no to search:");
key=sc.nextInt();
}
void search(){
int i,flag=0,pos=0;
 for(i=0;i<10 && flag==0;i++){
    if(a[i]==key){
       flag=1;
       pos=i+1; 
   }
}
 if(flag==1)
    System.out.println("No find of:"+pos);
  else
     System.out.println("No.Not found");
}
}

class MainLinear{
public static void main(String args[]){
Linear obj= new Linear();
obj.getData();
obj.search();

}

}
