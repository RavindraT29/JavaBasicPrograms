import java.util.Scanner;
class Pylindrom1{
public static void main(String args[]){
int n,i,b,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
n=sc.nextInt();
for(i=1;i<=n;i++){
  for(b=1;b<n;b++)
    System.out.print(" ");

   for(j=1;j<=n+1-i;j++)
     System.out.print("*");

    System.out.println();
}



}



}