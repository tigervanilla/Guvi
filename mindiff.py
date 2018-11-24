n=int(input())
ar=[int(i) for i in input().split()]
ar.sort()
diff=ar[1]-ar[0]
for i in range(1,n-1):
    diff=min(diff,ar[i+1]-ar[i])
print(diff)