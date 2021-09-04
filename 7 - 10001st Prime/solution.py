numbers = [True for x in range(114320)] #nth prime always less than n(ln(n)+ln(ln(n)))
primes_found = 0
for i in range(2,114320):
    if numbers[i]:
        primes_found += 1
        if primes_found == 10001:
            print(i)
            break
        for multiple in range(2*i,114320, i):
            numbers[multiple] = False
