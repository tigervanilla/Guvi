while True:
    try:
        a,op,b=input().split()
        a,b=int(a),int(b)
        if op=='/':
            ans=a//b
        elif op=='%':
            ans=a%b
        print(ans)
    except Exception:
        exit(0)
    