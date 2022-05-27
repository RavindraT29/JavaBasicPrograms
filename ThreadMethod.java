import java.util.Thread;
class ThreadMethod{

public static void main(String args[]){
   A thread1 = new A ();
   B thread2= new B ();
   C thread3= new C ();
   System.out.println("Thread A is being started...");
   thread1.start();
   System.out.println("Thread B is being started...");
   thread2.start();
   System.out.println("Thread C is being started...");
   thread3.start();
}
}
class A extends Thread {
public void run(){
for(int i=1;i<=5;i++){
   if(i==1)
   yield();
   System.out.println("\n Form Thread A: i="+i);
}
System.out.println("End of Thread A");
}
}
class B extends Thread{
  public void run(){
  for(int j=1;j<=5;j++){
   System.out.println("\n Form Thread B:j="+j);
  if(j==3)
  stop();
}
System.out.println("End of Thread B");
}
}
class C extends Thread{
  public void run(){
   for(int k=1;k<=5;k++){
   System.out.println("\n form Thread C:K="+k);
   if(k==1)
   try{
     sleep(1000);
}catch(Excepton e){
  System.out.println(e);
}
System.out.println("End of Thread C");

}
}
