n=int(input())
f=set([1,n])
for i in range(2,int(n**0.5)+1):
    if n%i==0:
        f.add(i)
        f.add(n//i)
print(sorted(f))