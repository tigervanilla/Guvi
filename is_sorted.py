def is_sorted(ar):
    for i in range(len(ar)-1):
        if ar[i]>ar[i+1]: return False
    return True

n=int(input())
ar=[int(i) for i in input().split()]
print('yes') if is_sorted(ar) else print('no')