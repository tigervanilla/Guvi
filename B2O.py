b=input()
if len(b)%3:
    b='0'*(3-len(b)%3)+b
o=[]
for i in range(0,len(b),3):
    o.append(str(int(b[i])*4 + int(b[i+1])*2 + int(b[i+2])))
print(''.join(o))
