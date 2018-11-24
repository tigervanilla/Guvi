from math import factorial
n,k=(int(i) for i in input().split())
nPk=factorial(n)//factorial(n-k)
print(nPk)