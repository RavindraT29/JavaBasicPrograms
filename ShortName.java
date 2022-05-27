import java.util.Scanner;
class ShortName{
public static void main(String args[]){

  int i,j,x;
  char c,d;
  Scanner sc=new Scanner(System.in);
  String name=new String();
  System.out.println("Enter String:");
  name=sc.nextLine();
  i=0;
  j=name.length()-1;
  while(name.charAt(j)!=(' '))
  j--;
  x=j;
  while(i<j){
    if(i==0)
     System.out.print(name.charAt(i)+".");
    else
     {
      c=name.charAt(i);
      d=name.charAt(i+1);
     if(c==' ' && d!=' ')
      System.out.print(d+".");
  }
   i++;
}
System.out.println(name.substring(x));
  
}

}