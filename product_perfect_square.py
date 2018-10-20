n,m=(int(i) for i in input().split())
p=n*m
sroot = int(p**0.5)
if p==sroot**2:
    print('yes')
else:
    print('no')