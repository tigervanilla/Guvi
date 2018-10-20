def GCD(a,b):
    if (a == 0) :
        return b
    return GCD(b % a, a);

n,m=(int(i) for i in input().split())
print(GCD(n,m))
