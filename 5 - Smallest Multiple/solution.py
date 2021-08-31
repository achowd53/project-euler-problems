def gcd(a,b): return a if b==0 else gcd(b, a%b)
def lcm(a,b): return a*b/gcd(a,b)
ans = 1
for i in range(1,20+1): ans = lcm(ans, i)
print(int(ans))