n,m=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
ans=set(ar[:n]).intersection(set(ar[n:]))
print(ans)