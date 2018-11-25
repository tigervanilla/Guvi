n=int(input())
ar=[int(i) for i in input().split()]
ans=0
for i in range(n-1):
    ans+=max(ar[i],ar[i+1])
print(ans)