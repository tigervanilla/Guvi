n=int(input())
b=[int(i) for i in input().split()]
for i in range(1,n):
    if not b[i]%b[i-1]:
        print(b[i])