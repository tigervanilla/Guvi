from heapq import nsmallest
n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
t=nsmallest(k,ar)
print(t[-1])