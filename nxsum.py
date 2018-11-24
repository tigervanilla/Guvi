n,x=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
i,j=0,n-1
while(i<j):
    if ar[i]+ar[j]==x:
        print('yes')
        break
    elif ar[i]+ar[j]>x:
        j-=2
    else:
        i+=1
