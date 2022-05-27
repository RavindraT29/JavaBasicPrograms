import java.util.Scanner;

class NaturalSumNumber{

public static void main(String args[]){

int n,i,add=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter value of Natural Number:");
n=sc.nextInt();
 i=1;

while(i<=n){
add = add+i;
i=i+1;
System.out.println("Addtion="+add);

}

}

}