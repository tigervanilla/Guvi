s=input()
a=n=False
for ch in s:
    if ch.isalpha():
        a=True
    elif ch.isdecimal():
        n=True
print('Yes') if a and n else print('No')
