s=input().replace(' ','').lower()
ar=[0]*26
least=1
for i in s:
    j=ord(i)-97
    ar[j]+=1
    if ar[j]<least: least=ar[j]
for i in range(26):
    if ar[i]==least: print(chr(i+97),end=' ')