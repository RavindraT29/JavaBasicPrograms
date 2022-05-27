import java.util.Scanner;
class Pymid4{

public static void main(String args[]){

int n,i,b,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
for(i=1;i<=n;i++){
  for(b=1;b<=n-i;b++)
    System.out.print(" ");

for(j=1;j<=2*i-1;j++)
   System.out.print("*");
System.out.println();

n=n-1;
for(i=1;i<=n;i++)
  for(b=1;b<=i;b++)
    System.out.println(" ");
for(j=1;j<=2*(n-i)+1;j++)
    System.out.println("*");

System.out.println();


}

}


}