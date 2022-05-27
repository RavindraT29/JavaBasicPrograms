import java.util.Scanner;
class PalindromeString{
public static void main(String args[]){
 String s=new String();
 Scanner sc= new Scanner(System.in);
 s=sc.nextLine();
 int i,j,flag=0;
 1=0;
 j=s.length()-1;
  flag=0;
  while(i<j && flag==0){
   if(s.charAt(1)!=s.charAt(j))
     flag=1;
     break;
} 
i++;
j--;

}
if(flag==0)
  System.out.println("Palindrome:");
 else
   System.out.println("Not Palindrome"); 
}
}