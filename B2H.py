b=input()
h=[]
lenb=len(b)
if lenb%4:
    b='0'*(4-lenb%4)+b
for i in range(0,lenb,4):
    nibble = int(b[i])*8 + int(b[i+1])*4 + int(b[i+2])*2 + int(b[i+3])
    if nibble>9:
        nibble = chr(nibble+55)      # i.e. nibble=nibble-9+64
    else:
        nibble=str(nibble)
    h.append(nibble)
print(''.join(h))