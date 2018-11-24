n,k=input().split()
flag=True
for i in range(int(k)+1):
    if str(i) not in n: 
        flag=False
        break
print('yes') if flag else print('no')