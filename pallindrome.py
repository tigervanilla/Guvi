n=abs(int(input()))
s,t=n,0
while(n>0):
    r=n%10
    n//=10
    t=t*10+r
print('yes') if t==s else print('no')
