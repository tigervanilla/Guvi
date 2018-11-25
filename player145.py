n=int(input())
b=[int(i) for i in input().split()]
flag=True
if len(set(b))!=n: flag=False
for i in b:
    if i>n:
        flag=False
        break
if flag:print('yes')
else:print('no')