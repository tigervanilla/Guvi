def pro_23_myFunc():
	sqwe=input()
	stqwe=list(s)
	nqwe,eqwe,sqwe,wqwe=(0,1,2,3)
	dirqwe=nqwe
	xqwe,yqwe=0,0
	for moveqwe in stqwe:
		if moveqwe=='L':
			dirqwe=(dirqwe+1)%4
		elif moveqwe=='R':
			dirqwe=(4+dirqwe-1)%4
		else :
			if dirqwe==nqwe:
				yqwe+=1
			elif dirqwe==eqwe:
				xqwe+=1
			elif dirqwe==wqwe:
				xqwe-=1
			elif dirqwe==sqwe:
				yqwe-=1
	return (xqwe==0 and yqwe==0)
pro_23_myFunc()