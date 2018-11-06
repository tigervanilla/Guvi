def hcf(a,b):
    if b>a:
        a,b=b,a
    while b>0:
        a,b=b,a%b
    return a

n,k=(int(i) for i in input().split())
print(hcf(n,k))