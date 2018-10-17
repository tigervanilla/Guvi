n=input()
d=len(n)
p,q=int(n),0
while p>0:
    r=p%10
    p//=10
    q=q+r**d
print('yes') if q==int(n) else print('no')
