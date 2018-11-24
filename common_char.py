a,b=input().split()
a=set(a)
b=set(b)
print('yes') if a.intersection(b) else print('no')