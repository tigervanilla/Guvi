n=int(input())
f=[]
for i in range(2,int(n**0.5)+1,2):
    if not n%i:
        f.append(i)
        if not (n//i)%2:
            f.append(n//i)
if not n%2:
    f.append(n)
print(f)
