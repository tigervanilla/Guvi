n=int(input())
ar=[int(i) for i in input().split()]
l,t=1,1
for i in range(n-1):
    if ar[i]<ar[i+1]: t+=1
    else:
        l=max(l,t)
        t=1
l=max(l,t)
print(l)