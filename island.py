n=int(input())
mat=[]
for _ in range(n):
    mat.append(input().split())
island=0
for i in range(n):
    for j in range(n):
        if 0<i<n-1 and 0<j<n-1 and mat[i][j]=='1':
            if mat[i][j+1]=='0' and mat[i][j-1]=='0' and mat[i-1][j]=='0' and mat[i+1][j]=='0': island+=1
        elif i==0 and mat[i][j]=='1':
            if j==0 and mat[i][j+1]=='0' and mat[i+1][j]=='0': island+=1
            elif j==n-1 and mat[i][j-1]=='0' and mat[i+1][j]=='0': island+=1
            elif mat[i][j-1]=='0' and mat[i][j+1]=='0' and mat[i+1][j]=='0':  island+=1
        elif i==n-1 and mat[i][j]=='1':
            if j==0 and mat[i][j+1]=='0' and mat[i-1][j]=='0': island+=1
            elif j==n-1 and mat[i][j-1]=='0' and mat[i-1][j]=='0': island+=1
            elif mat[i][j-1]=='0' and mat[i][j+1]=='0' and mat[i-1][j]=='0':  island+=1
        elif j==0 and mat[i][j]=='1':
            if mat[i+1][j]=='0' and mat[i-1][j]=='0' and mat[i][j+1]: island+=1
        elif j==n-1 and mat[i][j]=='1':
            if mat[i+1][j]=='0' and mat[i-1][j]=='0' and mat[i][j-1]: island+=1
print(island)
            