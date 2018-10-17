def isPrime(a):
    for i in range(2,int(a**0.5)+1):
        if a%i==0:
            return False
    return True

a,b=(int(i) for i in input().split())
for i in range(a+1,b):
    if isPrime(i):
        print(i,end=" ")
