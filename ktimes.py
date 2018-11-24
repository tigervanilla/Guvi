n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
d={}
for i in ar:
    d.setdefault(i,0)
    d[i]+=1
for key,value in d.items():
    if value==k:
        print(key)
        break