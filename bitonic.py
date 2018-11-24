n=int(input())
ar=[int(i) for i in input().split()]
low,high=0,n-1
while(low<=high):
    mid=low+(high-low)//2
    if max(ar[mid],ar[mid-1],ar[mid+1])==ar[mid]:
        print(ar[mid])
        break
    elif ar[mid]>=ar[mid-1] and ar[mid]<ar[mid+1]:
        low=mid+1
    else: high=mid-1
