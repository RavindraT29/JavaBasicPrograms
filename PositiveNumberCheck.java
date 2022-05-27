import java.util.Scanner;
class PositiveNumberCheck{

public static void main(String args[]){
int a;
Scanner sc= new Scanner(System.in);
System.out.println("Enter number");
a=sc.nextInt();
if(a>0)
System.out.println("Positive number");
else if(a<0)
System.out.println("Nagative number");
else
System.out.println("Zero number");

}

}