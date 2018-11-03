roman=input()
number=0
for i in roman:
    if i=='I':
        number+=1
    elif i=='V':
        number+=5
    elif i=='X':
        number+=10
print(number)