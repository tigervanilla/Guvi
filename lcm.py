def GCD(a,b):
    if (a == 0) :
        return b
    return GCD(b % a, a)

n,m=map(int,input().split())
gcd=GCD(n,m)
lcm=n*m//gcd
print(lcm)