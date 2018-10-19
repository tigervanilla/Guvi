s=input()
cnt=0
for ch in s:
    if not (ch.isalnum() or ch.isspace()):
        cnt+=1
print(cnt)
