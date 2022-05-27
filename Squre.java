import java.util.Scanner;

class Squre{

public static void main(String args[]){
int x,y,pro=1;
Scanner sc= new Scanner(System.in);
System.out.println("Enter base:");
x=sc.nextInt();
System.out.println("Enter power:");
y=sc.nextInt();
while(y>0){
pro=pro*x;
y--;

}
System.out.println("Value="+pro);

}

}