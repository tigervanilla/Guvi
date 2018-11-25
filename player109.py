n=int(input())
ar=[int(i) for i in input().split()]
ssum=sum(ar)
print(ssum,end=' ')
for i in ar[0:n-1]:
    ssum-=i
    print(ssum,end=' ')