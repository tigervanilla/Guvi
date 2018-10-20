s=input()
n=len(s)
if n%2!=0:
    s=s[:n//2]+'*'+s[n//2+1:]
else:
    s=s[:n//2-1]+'**'+s[n//2+1:]
print(s)