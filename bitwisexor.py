n=int(input())
ar=[int(i) for i in input().split()]
ans=ar[0]
for i in ar[1:]:
    ans=ans^i
print(ans)