s=input().lower().replace(' ','')
ar=[0]*26
for i in s:
    ar[ord(i)-97]+=1
m=max(ar)
print(m,end=' ')
for index,item in enumerate(ar):
    if item==m:
        print(chr(index+97),end='')
