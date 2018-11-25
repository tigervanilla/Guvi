a,b=(int(i) for i in input().split())
f=1
while a>b:
    f*=a
    a-=1
print(f)