import java.util.Scanner;
class PymidrightToLeftP{

public static void main(String args[]){

int n,j,s,i;
Scanner sc= new Scanner(System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
for(i=01;i<=n;i++){
for(s=1;s<=n-i;s++)
    System.out.print(" ");
for(j=1;j<=i;j++)
    System.out.print("*");
    //System.out.print(i);
    //System.out.print(j); 

    System.out.println();


}

}





}