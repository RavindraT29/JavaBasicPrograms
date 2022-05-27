import java.util.Scanner;
class Table{

public static void main(String args[]){

int i,j=1;
Scanner sc= new Scanner(System.in);
System.out.println("Enter no of table print:");
i=sc.nextInt();
while(j<=10){
System.out.println(i*j);
j=j+1;

}

}

}