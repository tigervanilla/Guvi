def HCF(a,b):
    if b>a:
        a,b=b,a
    while b:
        a,b=b,a%b
    return a

n=int(input())
ar=list(map(int,input().split()))
for i in range(1,n):
    ar[i]=HCF(ar[i],ar[i-1])
print(ar[-1])