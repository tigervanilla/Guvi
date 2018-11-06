ar=list(input())
for index,item in enumerate(ar):
    ar[index]=item.upper() if item.islower() else item.lower()
print(''.join(ar))