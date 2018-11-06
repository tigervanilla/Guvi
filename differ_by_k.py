a,b,k=[i if i.isalpha() else int(i) for i in input().split()]
k-=abs(len(a)-len(b))
for i in range(len(a)):
    if a[i] != b[i]:
        k-=1
print('yes') if not k else print('no')