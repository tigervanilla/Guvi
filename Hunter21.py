n,m=(int(i) for i in input().split())
matrix=[]
for _ in range(n):
    matrix.append([int(i) for i in input().split()])
pos=[]
for i in range(n):
    for j in range(m):
        if matrix[i][j]==0:
            pos.append((i,j))
for coordinate in pos:
    x,y=coordinate[0],coordinate[1]
    for j in range(m):
        matrix[x][j]=0
    for i in range(n):
        matrix[i][y]=0
for row in matrix:
    for item in row:
        print(item,end=" ")
    print()