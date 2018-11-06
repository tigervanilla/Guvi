from math import ceil,floor
l,r=(int(i) for i in input().split())
print(floor(r**0.5)-ceil(l**0.5)+1)