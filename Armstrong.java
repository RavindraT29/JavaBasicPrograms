import java.util.Scanner;

class Armstrong{

public static void main(String args[]){

int n,z,count=0,digit,i,pro,sum=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter NO:");
n=sc.nextInt();
z=n;
while(z>0){
count=count+1;  // no of digit
z=z%10;

z=n;
while(z>0){
digit=z%10;pro=1;   //que
for(i=0; i<=count;i++){
pro=pro*digit;
sum=sum+pro;
z=z/10;
if(sum==n){
System.out.println("Armostrong NO:");
}
else
System.out.println("No Armostrong NO:");

}

}

}

}


}