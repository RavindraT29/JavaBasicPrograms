import java.util.Scanner;
class UpperAndLowerCase{
public static void  main(String args[]){
String str1= new String ();
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String:");
str1=sc.nextLine();
System.out.println("String in Upper case:"+str1.toUpperCase());
System.out.println("String in Upper case:"+str1.toLowerCase());
}
}