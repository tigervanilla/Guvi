s=input()
n=len(s)
isPrime=True
for i in range(2,int(n**0.5)+1):
    if n%i==0:
        isPrime=False
        break
print('yes') if isPrime else print('no')
