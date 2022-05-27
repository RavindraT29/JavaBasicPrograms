class ThreadId{
public static void main(String args[]){
  A aa = new A ();
  B bb = new B ();
  C cc = new C ();
   
   aa.setPriority(Thread.MIN_PRIORITY);
   bb.setPriority(Thread.NORM_PRIORITY);
   cc.setPriority(Thread.MAX_PRIORITY);
  System.out.println("\nInside Main Thread and it's Id is:"+Thread.currentThread.getId()+"\n Thread Priority="+Thread.currentThread().getPriority());
  System.out.println("\n Now calling other threads: Thread A-> Thread B-> Thread c");
  aa.start();
  bb.start();
  cc.start(); 
}
}
class A extends Thread{
   public void run(){
   System.out.println("\nInside Main Thread and it's Id A:"+Thread.currentThread.getId()+"\n  Thread Priority="+Thread.currentThread().getPriority());
}

}
class B extends Thread{
   public void run(){
   System.out.println("\nInside Main Thread and it's Id B:"+Thread.currentThread.getId()+"\n  Thread Priority="+Thread.currentThread().getPriority());
}

}
class C extends Thread{
   public void run(){
   System.out.println("\nInside Main Thread and it's Id C:"+Thread.currentThread.getId()+"\nMain Thread Priority="+Thread.currentThread().getPriority());
}

}