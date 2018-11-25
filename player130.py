from itertools import accumulate
n=int(input())
ar=[int(i) for i in input().split()]
result=list(accumulate(ar))
for i in range(n):
    if not ar[i]%2: print(result[i],end=' ')
    else: print(ar[i],end=' ')