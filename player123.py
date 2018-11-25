def primeFactors(n): 
    pf=set()
    # Print the number of two's that divide n 
    while n % 2 == 0: 
        pf.add(2), 
        n = n / 2
          
    # n must be odd at this point 
    # so a skip of 2 ( i = i + 2) can be used 
    for i in range(3,int(n**0.5)+1,2): 
          
        # while i divides n , print i ad divide n 
        while n % i== 0: 
            pf.add(i), 
            n = n / i 
              
    # Condition if n is a prime 
    # number greater than 2 
    if n > 2: 
        pf.add(n) 
    return pf

n=int(input())
pf=primeFactors(n)
for i in pf:
    print(i,end=' ')