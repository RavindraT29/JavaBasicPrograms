import java.util.Scanner;
class Main{

public static void main(String args[]){

SumOfNumber obj= new SumOfNumber();
obj.getData();
obj.ofSumDigits();

}

class SumOfNumber{

void getData()
{
int i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
i=sc.nextInt();
}
} 
void ofSumDigits()
{

int sum=0;
while(i>0)
{
sum=sum+i%10;
i=i/10;
}
System.out.println("Sum of digit:"+sum);
}



}

}