import re
s=input()
try:
    re.match(r'^[0-9]{2}/[0-9]{2}/[0-9]{4}$',s).group()
    print('yes')
except Exception:
    print('no')