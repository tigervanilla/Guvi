n=input()
if not n.isdigit():
    print('Invalid')
else:
    n=int(n)
    print('Even') if n%2==0 else print('Odd')
