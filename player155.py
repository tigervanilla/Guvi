n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
ar=sorted(ar[:k])+sorted(ar[k:],reverse=True)
for i in ar: print(i,end=' ')