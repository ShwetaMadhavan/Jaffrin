import java.util.*;
class Solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int temp;
float ans=0;
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
if(n%2==0){
ans=((a[n/2])+(a[(n-1)/2]))/2;}
else{
ans=a[n/2];}
System.out.println(ans);
}
}
