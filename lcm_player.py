def hcf(a,b):
    if b>a:
        a,b=b,a
    while b:
        a,b=b,a%b
    return a

a,b=(int(i) for i in input().split())
print(a*b//hcf(a,b))
