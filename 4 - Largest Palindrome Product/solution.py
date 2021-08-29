ans = 0
for a in range(999,0,-1):
    for b in range(999,0,-1):
        palindrome = str(a*b)
        if palindrome[:len(palindrome)//2] == palindrome[-len(palindrome)//2:][::-1]:
            ans = max(ans,int(palindrome))
print(ans)