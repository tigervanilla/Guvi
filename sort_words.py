n=int(input())
words=input().split()
print(' '.join(sorted(words,key=len)))