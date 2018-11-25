n,k=(int(i) for i in input().split())
ar=[int(i) for i in input().split()]
temp=[0]*100001
for i in ar:
    temp[i]+=1
for index,item in enumerate(temp):
    if 0<item<k:
        print(index,end=' ')