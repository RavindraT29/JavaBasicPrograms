import java.util.Scanner;
class compareToFunction{
public static void  main(String args[]){
String str1= new String ();
String str2= new String ();
Scanner sc=new Scanner(System.in);
System.out.println("Enter First String:");
str1=sc.nextLine();
System.out.println("Enter Second String:");
str2=sc.nextLine();
if(str1.compareTo(str2)==0)
System.out.println("Equal String:");
else if(str1.compareTo(str2)>0)
System.out.println("Str1 is greater than Str2");
else
System.out.println("Str2 is greater than Str1");

}

}