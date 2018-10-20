while True:
    try:
        a,b=(int(i) for i in input().split())
        print(abs(a-b))
    except Exception:
        break