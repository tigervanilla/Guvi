n=int(input())
ar=[int(i) for i in input().split()]
ar.sort()
if n%2!=0:
    med=ar[n//2]
else:
    med=(ar[n//2]+ar[n//2-1])/2
print(med)
