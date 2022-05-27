import java.util.Scanner;
class Reverse{

int n;
void getdata(int i){
n=i;
} 
void putdata(){

int rev=0;
while(n>0){
rev=(rev*10)+n%10;
n=n/10;

}
System.out.println("Reverse:"+rev);

}
public static void main(String args[]){
int m;
Reverse obj= new Reverse();
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of find number:");
m=sc.nextInt();
obj.getdata(m);
obj.putdata();

}

}