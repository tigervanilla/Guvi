a,b=input().split()
flag=True
if len(a)!=len(b):
    flag=False
else:
    for i in range(len(a)):
        if a[i]!=b[i]:
            flag=False
            break
print('yes') if flag else print('no')