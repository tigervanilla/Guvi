def GCD(a,b):
    if (a == 0) :
        return b
    return GCD(b % a, a)

def LCM(a,b):
    return a*b//GCD(a,b)

n=int(input())
ar=list(map(int,input().split()))
for i in range(1,n):
    ar[i]=LCM(ar[i],ar[i-1])
print(ar[-1])

