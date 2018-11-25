n=int(input())
ar=[int(i) for i in input().split()]
psum=ar[0]
ssum=sum(ar)
print(psum+ssum,end=' ')
for i in range(0,n-1):
    ssum-=ar[i]
    psum+=ar[i+1]
    print(psum+ssum,end=' ')