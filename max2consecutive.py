n=int(input())
ar=[int(i) for i in input().split()]
for i in range(1,n):
    print(max(ar[i],ar[i+1]),end=' ')