n=int(input())
ar=list(map(int,input().split()))
flag=False
for i in ar:
    if not i%2: 
        flag=True
        break
print('even') if flag else print('odd')