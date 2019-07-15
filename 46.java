import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int c=0,p=0;;
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
    p++;
}
else{
c++;

}}
System.out.println(c);
}
}
