import re
n,k=(int(i) for i in input().split())
ar=[]
for _ in range(n):
    ar.append(input())
t=0
for i in ar:
    if re.search(r'[aeiouAEIOU]',i):
        t+=1
print('yes') if t>=k else print('no')