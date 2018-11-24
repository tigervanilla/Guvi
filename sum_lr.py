l,r=(int(i) for i in input().split())
if not l%2:l+=1
print(sum(range(l,r+1,2)))