class DemoInterface{
public static void main(String args[]){
Result aa = new Result();
aa.getroll(101);
aa.getmarks(35F,9F);
aa.display();
}
}
class Student{

int roll;
void getroll(int n){
roll=n;
}
void putroll(){
 System.out.println("Roll="+roll);

}

}
class Test extends Student{
float mark1,mark2;
void getmarks(float m1,float m2){
mark1=m1;
mark2=m2;
}
void putmarks(){
System.out.println("marks1="+mark1+"\nmark2="+mark2);
}

}
interface Sports{
float sportmark =6.0F;
public void putsport();
}
class Result extends Test implements Sports{
float total;
public void putsport(){
System.out.println("Sports Marks="+sportmark );
}
void display(){
 total=mark1+mark2+sportmark ;
 putroll();
 putmarks();
 putsport();
 System.out.println("Total Marks="+total);

}

}