import java.util.Scanner;
class A{
int a,b;
void input(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter first number:");
a=sc.nextInt();
System.out.println("Enter Second number:");
b=sc.nextInt();

}

}
class B extends A{
void add(){
System.out.println("Addtion:"+(a+b));

}

}
class C extends A{
void subtract(){
System.out.println("Subtraction:"+(a-b));

}

}
class HierarchicalInheritance{
public static void main(String args[]){

B obj= new B ();
C obj1= new C ();
obj.input();
obj.add();


obj1.input();
obj1.subtract();

}

}