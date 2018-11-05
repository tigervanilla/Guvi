a=list(input())
b=[]
for ch in a:
    b.append(chr((ord(ch)-65+3)%26+65))
print(''.join(b))