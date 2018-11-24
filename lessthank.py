n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split() if int(i)<k]
ar.sort()
for i in ar:
    print(i,end=' ')