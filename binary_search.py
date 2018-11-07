n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
flag=False
low,high=0,n-1
while low<=high:
    mid=low+(high-low)//2
    if ar[mid]==k:
        print('yes')
        flag=True
        break
    elif ar[mid]>k:
        high=mid-1
    else:
        low=mid+1
if not flag:
    print('no')