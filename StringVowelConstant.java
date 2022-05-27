import java.util.Scanner;
class StringVowelConstant{
public static void main(String args[]){
String a=new String ();
Scanner sc=new Scanner(System.in);
System.out.println("Enter String:");
a=sc.nextLine();
int i,vowel,cons;
vowel=cons=0;
for(i=0;i<a.length();i++){
    char ch=a.charAt(i);
    if(ch!=' '){
   if(ch=='a'||(ch=='e')||(ch=='i')||(ch=='0')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
    vowel++;
    else
    cons++; 
  }
}
System.out.println("Total Vowels="+vowel+"Total Consonants="+cons);


}





} 