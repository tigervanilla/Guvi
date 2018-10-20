s=set(input().casefold())
v=set('aeiou')
print('yes') if s.intersection(v) else print('no')