n,r=(int(i) for i in input().split())
if r>n-r:
    r=n-r
num,den=1,1
while r>0:
    num*=n
    n-=1
    den*=r
    r-=1
print(num//den) 