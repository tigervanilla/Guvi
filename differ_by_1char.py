a,b=input().split()
a,b=a.lower(),b.lower()
ar=[0]*26
for ch in a:
    ar[ord(ch)-97]+=1
for ch in b:
    ar[ord(ch)-97]-=1
print('yes') if ar.count(0)==24 else print('no')