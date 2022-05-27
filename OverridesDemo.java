class A{

void message(){
System.out.println("Parent class:");

}

}
class B extends A{

void message(){
System.out.println("childs class:");
}
}
class OverridesDemo{
public static void main(String args[]){

B obj = new B();
obj.message();


}


}