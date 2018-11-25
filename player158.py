n,k=(int(i) for i in input().split())
ans=bin(n*k)[2:]
t=ans.find('1')
print(ans.find('1',t+1)+1)