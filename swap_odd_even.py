s=input()
r=[None]*len(s)
for index,item in enumerate(s):
    if not index%2:
        r[index+1]=item
    else:
        r[index-1]=item
print(r)