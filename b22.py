n=int(input())
res=0
m=n
while n!=0:
    rem=n%10
    res=(res*10)+rem
    n=n//10
if(res==m):
    print("yes")
else:
    print("no")
