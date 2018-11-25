s,k=input().split()
k=int(k)
s=list(s)
for i in range(k-1,len(s),k):
    s[i]=s[i].upper()
print(''.join(s))