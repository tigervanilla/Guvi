str1,str2=input().split()
flag=True
if len(str1)!=len(str2):
    flag=False
else:
    iso={}
    for i in range(len(str1)):
        iso.setdefault(str1[i],str2[i])
        if iso[str1[i]]!=str2[i]:
            flag=False
            break
print('yes') if flag else print('no')