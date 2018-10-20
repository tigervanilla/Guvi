n=int(input())
binary=bin(n)[2:]
no_of_bits=len(binary)
ans=int('1'+'0'*no_of_bits,2)
print(ans)