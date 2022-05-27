import java.util.Scanner;
class DemoSelectionThreeNumber{

public static void main(String args[]){

int  a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first number:");
a=sc.nextInt();
System.out.println("Enter your Second number:");
b=sc.nextInt();
System.out.println("Enter your third number:");
c=sc.nextInt();

if(a>b && a>c)
System.out.println("Max number:"+a);
else if(b>a && b>c)
System.out.println("Max number:"+b);
else
System.out.println("Max number:"+c);


}



}