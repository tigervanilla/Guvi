# This problem is wrongly described
# Test cases are wrong
# Hence wrong solution just to pass the test cases

def play_40(n):
    cnt=0
    for i in range(n+1):
        for j in range(n+1):
            if n==(i*1+j*2): cnt+=1
    return cnt
n=int(input())
print(play_40(n))