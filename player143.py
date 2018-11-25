from operator import itemgetter
n=int(input())
ar=[[int(i)] for i in input().split()]
b=[int(i) for i in input().split()]
for i in range(n):
    ar[i].append(b[i])
ar.sort(key=itemgetter(1))
for i in ar:
    print(i[0],end=' ')