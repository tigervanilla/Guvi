n=[ord(i) for i in input()]
is_numeric=True
for i in n:
    if i>57 or i<48 and i!=46:
        is_numeric=False
        break
print('yes') if is_numeric else print('no')
