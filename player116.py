from functools import cmp_to_key

def mysort(a,b):
    if a[1]>b[1]: return -1
    elif a[1]==b[1]:
        if a[0]>b[0]: return -1
        else: return 1
    else: return 1

n = int(input())
ar=[int(i) for i in input().split()]
d={}
for ch in ar:
    d.setdefault(ch,0)
    d[ch]+=1
ar=list(d.items())
mysort_key=cmp_to_key(mysort)
ar.sort(key=mysort_key)
for ele in ar:
    print(ele[0],end=' ')        