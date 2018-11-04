s=reversed(input())
vowel=set('aeiouAEIOU')
r=''.join([i for i in s if i not in vowel])
print(r)