givenData = input().split(" ")
cnt = 0
k = [len(i) for i in givenData]
for i in range(min(k)):
    if givenData[0][i] != givenData[1][i]:
        cnt += ord(givenData[1][i]) - ord(givenData[0][i])
print(cnt)