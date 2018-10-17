a,b=(int(i) for i in input().split())
if a%2==0:
    ans=[str(i) for i in range(a+2,b,2)]
else:
    ans=[str(i) for i in range(a+1,b,2)]
print(",".join(ans))
