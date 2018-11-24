n=int(input())
ar=[int(i) for i in input().split()]
o=e=-1
temp=[0]*2
for i in ar:
    if i%2:
        o=i
        temp[1]+=1
    else:
        e=i
        temp[0]+=1
print(e) if temp[0]==1 else print(o)
