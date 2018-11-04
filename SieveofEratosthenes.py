l,r=(int(i) for i in input().split())
ar=[True for i in range(r+1)]
ar[0]=ar[1]=False
cnt=0
while True:
    #print(ar)
    try:
        i=ar.index(True)
        if l<=i<=r:
            cnt+=1
        ar[i]=False
        j=i**2
        while j<=r:
            ar[j]=False
            j+=i
    except Exception:
        break
print(cnt)