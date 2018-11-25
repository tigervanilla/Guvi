n,k=(int(i) for i in input().split())
ans=bin(n|k)
print(ans.count('1'))