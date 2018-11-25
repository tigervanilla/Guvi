n,k=(int(i) for i in input().split())
ans=bin(n*k)[::-1]
print(ans.find('1')+1)