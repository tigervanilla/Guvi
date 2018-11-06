x1,y1=(float(i) for i in input().split())
x2,y2=(float(i) for i in input().split())
x3,y3=(float(i) for i in input().split())

slope1=(y2-y1)*(x3-x2)
slope2=(y3-y2)*(x2-x1)
if slope1==slope2:
    print('yes')
else:
    print('no')