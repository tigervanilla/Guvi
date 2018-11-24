n=int(input())
ar=[int(i) for i in input().split()]
ans=1
d=1
for i in range(n-1):
    if ar[i]!=ar[i+1]:
        ans=max(ans,d)
        d=1
    else: d+=1
ans=max(ans,d)
print(ans)
