s=input()+'#'
t=1
for i in range(1,len(s)):
    if s[i]==s[i-1]:t+=1
    else:
        print(s[i-1],t,sep='',end='')
        t=1