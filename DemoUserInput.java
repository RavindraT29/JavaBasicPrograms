import java.util.Scanner;
class DemoUserInput{

public static void main(String args[]){

int a,b,c;

Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
a=sc.nextInt();
System.out.println("Enter second number:");
b=sc.nextInt();
c=a+b;
System.out.println("Addtion:"+c);


}

}