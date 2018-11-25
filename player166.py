from math import factorial
a,b=(int(i) for i in input().split())
if b>a:
    a,b=b,a
print(factorial(b))