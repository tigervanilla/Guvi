s1,s2=input().split()
s1=max(s1,s2,key=len)
print(s1[:len(s2)]+s2)