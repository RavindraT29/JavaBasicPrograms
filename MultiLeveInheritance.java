import java.util.Scanner;
class A{

int a;
void input(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter  First No:");
a=sc.nextInt();
}
}
class B extends A{
int b;
void getData(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter  Second No:");
b=sc.nextInt();
}
}
class c extends B{
 void add(){

System.out.println("Addtion:"+(a+b));

}
}
class MultiLeveInheritance{

public static void main(String args[]){

c obj=new c ();
obj.input();
obj.getData();
obj.add();
}

}