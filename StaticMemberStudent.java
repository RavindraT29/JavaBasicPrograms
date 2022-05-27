class StaticMemberStudent{

String name;
int rollNumber;
static String cAddres = "Bamu Univercity";

StaticMemberStudent(int x, String y){
    rollNumber=x;
    name=y;
}
void disPlay(){
 System.out.println("RoolNumber: "+rollNumber+"Name:"+name+"College:"+cAddres);


}


public static void main(String args[]){
StaticMemberStudent obj = new StaticMemberStudent(10,"Ravi");
StaticMemberStudent obj1 = new StaticMemberStudent(11,"Rani");
obj.disPlay();
obj1.disPlay();

}


}