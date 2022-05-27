class ExceptionHandling{
 public static void main(String args[]){

 int a,b,c,d,e;
  a=10;
  b=5;
  c=5;
  try{

   d=a/(b-c);
   System.out.println("Divided by Zero Error");
 
}
catch(ArithmeticException m){
  System.out.println("Divide by Zero error");
}
  e=a/(b+c);
  System.out.println("Division="+m);

}

}