word,k=input().split()
wordlen=len(word)
k=int(k)%wordlen
print(word[wordlen-k:],word[:wordlen-k],sep='')
