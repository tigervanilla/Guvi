n=int(input())
rn=0
while n>0:
    rn=rn*10+n%10
    n//=10
print(rn)