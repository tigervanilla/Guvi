n=int(input())
ar=[int(i) for i in input().split()]
for i in range(1,n,2):
    ar[i],ar[i-1]=ar[i-1],ar[i]
for i in ar:
    print(i,end=' ');