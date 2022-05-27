import java.util.Scanner;
class BinarySearch{
int a[] = new int[10];
int key;
void getData(){
Scanner sc = new Scanner(System.in);
int i;
for(i=0;i<10;i++){
System.out.println("Enter No:");
a[i]=sc.nextInt();
}
System.out.println("Enter No to search:");
key=sc.nextInt();

}
void Search(){
int i,j,mid,flag,pos;
i=0;
j=9;
flag=0;
while(i<=j && flag==0){
mid=(i+j)/2;
if(a[mid]==key)
  j=mid-1;
if(a[mid]<key)
  i=mid+1;
}
if(flag==0)
  System.out.println("Not found:");
else
  System.out.println("not Foundat:"+pos);  

}
}
class BinarySearchDemo{
   public static void main(String args[]){

    BinarySearch obj= new BinarySearch();
    obj.getData();
    obj.Search();
}
}
