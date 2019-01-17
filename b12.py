n=int(input())
a=[]
for i in range(0,n):
    s=int(input())
    a.append(s)
max=a[0]
for i in range(1,n):
    if(a[i]>max):
        max=a[i]
print(max)
   
