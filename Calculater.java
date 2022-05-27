import java.util.Scanner;

class Calculater{

public static void main(String args[]){
int a,b,ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter a first number:");
a=sc.nextInt();
System.out.println("Enter second number:");
b=sc.nextInt();
System.out.println("Enter you choice 1-> Add 2-> Mul 3-> Div 4-> Sub in Enter your choice:");
ch=sc.nextInt();

if(ch==1)
System.out.println("Addtion= +(a+b));
else if(ch==2)
System.out.println("Multiplication= +(a*b));
else if(ch==3)
System.out.println("Division = +(a/b));
else if(ch==4)
System.out.println("Substraction: +(a-b));
else
System.out.println("Invalic choice:");

}

}