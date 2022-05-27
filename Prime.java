import java.util.Scanner;
class Prime{
int n;
void getData(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
}

void putData(){
int i,count=0;
for(i=1;i<=n;i++){
if(n%i==0){
count=count+1;
}
if(count==2)
System.out.println("Prime Number:");
else
System.out.println("Not Prime Number:");

}
}


public static void main(String args[]){

Prime obj=new Prime();
obj.getData();
obj.putData();

}

}