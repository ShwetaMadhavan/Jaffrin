x=int(input())
y=int(input())
for i in range(x+1,y):
    ans=0
    s=i
    while(s>0):
        r=s%10
        ans=ans+(r*r*r)
        s=s//10
    if(ans==i):
        print(i)
