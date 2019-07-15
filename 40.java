import java.util.*;
class Solution{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int[] a=new int[4];
int hr,min;
for(int i=0;i<4;i++){
a=sc.nextInt();
}
hr=Math.abs(a[0]-a[2]);
min=Math.abs(a[1]-a[3]);
System.out.println(hr+" "+min);
}
}
