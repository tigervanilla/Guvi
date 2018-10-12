n=input()
if not n.isdigit():
    print('Invalid Input')
elif int(n)>0:
    print('Positive')
elif int(n)<0:
    print('Negative')
else:
    print('Zero')
