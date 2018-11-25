s=input().split()
ml,mw=0,''
for w in s:
    if len(w)>ml:
        ml=len(w)
        mw=w
print(mw)