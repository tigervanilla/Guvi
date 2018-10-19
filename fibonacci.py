fib={1:1,2:1}
n=int(input())
for i in range(3,n+1):
    fib[i]=fib[i-1]+fib[i-2]
for v in fib.values():
    print(v,end=' ')

