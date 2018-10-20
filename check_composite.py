def isComposite(n):
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            return True
    return False

n=int(input())
print('yes') if isComposite(n) else print('no')