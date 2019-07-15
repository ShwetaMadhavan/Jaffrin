import java.util.*;
class Solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in)
int n=sc.nextInt();
int a=1,b=1;
int c=0;
System.out.print(a+" "+b+" ");
for(int i=0;i<n-2;i++){
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}}
}
