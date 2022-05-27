import java.util.Scanner;

class PymidReverse{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int n,j;
System.out.println("Enter number:");
n=sc.nextInt();
for(;n>=1;n--){
for(j=1; j<=n;j++){
//System.out.print("*");
System.out.print(j);

}
System.out.println();

}

}

}