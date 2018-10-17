def partition(ar,start,end):
    pivot=ar[end]
    i=j=start
    while j<end:
        if ar[j]<=pivot:
            ar[i],ar[j]=ar[j],ar[i]
            i+=1
        j+=1
    ar[i],ar[end]=pivot,ar[i]
    return i

def quicksort(ar,start,end):
    if start<=end:
        pindex=partition(ar,start,end)
        quicksort(ar,start,pindex-1)
        quicksort(ar,pindex+1,end)

n=int(input())
ar=[int(i) for i in input().split()]
quicksort(ar,0,n-1)
for i in ar:
    print(i,end=' ')
