n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
flag=False
for i in ar:
    if i==k:
        flag=True
        break
print('yes') if flag else print('no')