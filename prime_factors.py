n=int(input())
prime_factors=set()
for i in range(2,int(n**0.5)+1):
    if not n%i:
        prime_factors.add(i)
    j=i
    while not n%j:
        n//=j
for num in prime_factors:
    print(num,end=' ')