class StudentStaticMemberFunction{
String name;
int rno;
static String cname = "Bamu";

StudentStaticMemberFunction(int x,String y){
rno=x;
name=y;
}
void disPlay(){
System.out.println("Name :"+name+" "+"RollNuber:"+rno+" "+"collegeName:"+cname);

}
static void check(){
cname = "Goverment";

}

public static void main(String args[]){

StudentStaticMemberFunction obj= new StudentStaticMemberFunction(10,"vikas");
StudentStaticMemberFunction obj1= new StudentStaticMemberFunction(11,"Mukesh");
obj.disPlay();
obj.disPlay();
StudentStaticMemberFunction.check();  // object create
obj.disPlay();
obj.disPlay();
}


}