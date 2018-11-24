n,m=(int(i) for i in input().split())
a=[int(i) for i in input().split()]
b=[int(i) for i in input().split()]
ans=sorted(a+b)
for i in ans:
    print(i,end=' ')