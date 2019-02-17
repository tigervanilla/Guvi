def coinFunc(nKATA,lKATA,tKATA):
	kKATA=1
	cKATA=0
	sKATA=0
	lKATA.sort(reverse=True)
	for iKATA in range(nKATA):
		while(sKATA<tKATA):
			sKATA=sKATA+lKATA[iKATA]
			cKATA=cKATA+1
	print(cKATA)

def main():
	nKATA=int(input())
	tKATA=int(input())
	lKATA=[]
	for iKATA in range(nKATA):
		lKATA.append(int(input()))
	coinFunc(nKATA,lKATA,tKATA)

try:
	main()
except:
	print('INVALID')