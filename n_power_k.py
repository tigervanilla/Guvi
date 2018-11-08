from math import log
n,k=(int(i) for i in input().split())
res=log(n,k)
# ALTER res=log(n)/log(k) DEFAULT BASE=e
print('yes') if res==int(res) else print('no')