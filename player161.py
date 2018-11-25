import re
n=int(input())
ar=[]
for _ in range(n):
    ar.append(input())
flag=True
for i in ar:
    if not re.search(r'[aeiouAEIOU]',i):
        flag=False
        break
print('yes') if flag else print('no')