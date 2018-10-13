a,b,c=(int(i) for i in input().split())
if a>=b and a>=c:
    print(a)
elif b>=a and b>=c:
    print(b)
else:
    print(c)
