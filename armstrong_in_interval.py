def isArmstrong(n):
    t,d,q=int(n),len(n),0
    while t>0:
        r=t%10
        t//=10
        q=q+r**d
    if q==int(n):
        return True
    else:
        return False

a,b=(int(i) for i in input().split())
for i in range(a+1,b):
    if isArmstrong(str(i)):
        print(i,end=' ')
