def main():
	fPYKATA=1
	nPYKATA=int(input())
	for iPYKATA in range(1,nPYKATA): fPYKATA=fPYKATA*iPYKATA
	print(fPYKATA)
try:
	main()
except:
	print('invalid')