a=input()
a=a[::-1]
print(a[0],end='')
for i in a[1:]:
    print('-'+i,end='')