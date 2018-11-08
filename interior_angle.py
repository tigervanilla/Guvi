def is_interior(angles):
    if all(angles) and sum(angles)==180:
        return True
    return False


angles=[int(i) for i in input().split()]
print('yes') if is_interior(angles) else print('no')