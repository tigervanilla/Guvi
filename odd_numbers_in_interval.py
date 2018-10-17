a,b=(int(i) for i in input().split())
ans=[]
if a%2==0:
    for i in range(a+1,b,2):
        ans.append(str(i))
else:
    for i in range(a+2,b,2):
        ans.append(str(i))
print(" ".join(ans))
