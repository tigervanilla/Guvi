s=input()
stack=[]
for i in s:
    if i=='(':
        stack.append(i)
    elif i==')' and stack[-1]=='(':
        stack.pop()
if not stack: print('yes')
else: print('no')