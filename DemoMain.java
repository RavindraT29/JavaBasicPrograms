import java.util.Scanner;
class ASingleInheritance{

int a,b;
void input(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Number:");
a=sc.nextInt();
System.out.println("Enter Second Number:");
b=sc.nextInt();


 }
void add(){
System.out.println("Addtion:"+(a+b));

}
}
class B extends ASingleInheritance{
int c;
void getData(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter No:");
c=sc.nextInt();
}
void display(){

System.out.println("Addation:"+(a+b+c));
}

}
class DemoMain{
 public static void main(String args[]){
 B obj= new B();
obj.input();
obj.add();
obj.getData();
obj.display();

}

}