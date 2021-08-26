x = 600851475143
while True:
    for factor in range(2,x):
        if x%factor == 0:
            x //= factor
            break
    else:
        print(x)
        break