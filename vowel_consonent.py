ch=input()
vowels=set('aeiouAEIOU')
if not ch.isalpha():
    print('Invalid')
else:
    print('Vowel') if ch in vowels else print('Consonent')
