n,k=(int(i) for i in input().split())
ar=input().split()  
ar=ar[-1*k:]+ar[:-1*k]
for i in ar:
    print(i,end=' ')