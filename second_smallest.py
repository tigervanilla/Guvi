n=int(input())
ar=[int(i) for i in input().split()]
s=ss=10000000
for item in ar:
    if item<=s:
        ss=s
        s=item
    elif s<item<ss:
        ss=item
print(ss)