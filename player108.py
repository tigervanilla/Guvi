from itertools import accumulate
n=int(input())
ar=[int(i) for i in input().split()]
result=accumulate(ar)
for i in result: print(i,end=' ')