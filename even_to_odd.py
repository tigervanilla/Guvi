n=int(input())
if n%2: print('1')
else:
    ans=1
    while not n%2:
        ans*=2
        n//=2
    print(ans)