n=input()
n=int(n)
isPrime=1
for i in range(2,int(n**0.5)+1):
    if n%i==0:
        isPrime=0
        break
print('yes') if isPrime==1 else print('no')
