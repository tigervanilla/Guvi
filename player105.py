n=int(input())
ar=[int(i) for i in input().split()]
ar2=sorted(ar)
for i in ar2:
    print(ar.index(i)+1,end=' ')