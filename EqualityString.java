import java.util.Scanner;
class EqualityString{
 public static void main(String args[]){
   String str1= new String ();
   String str2= new String ();
   String str3= new String ();
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter First String:");
   str1=sc.nextLine();
   System.out.println("Enter Second String:");
   str2=sc.nextLine();
   System.out.println("Case Sensetive Checking:");
   if(str1.equals(str2))
   System.out.println("Equal String:");
   else
   System.out.println("Not Equal String:");
   System.out.println("Non Case Sensetive cheking:");
   if(str1.equalsIgnoreCase(str2))
    System.out.println("Equal String:");
    else
    System.out.println("Not Equal String");
}


}