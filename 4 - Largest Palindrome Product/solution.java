public class solution{
    public static void main(String[] args) {
        int i;
        int j;
        int ans = 0;
        boolean isPal;
        for (int a = 999; a > 0; a--) {
            for (int b = 999; b > 0; b--) {
                String palindrome = Integer.toString(a*b);
                i = 0;
                j = palindrome.length() - 1;
                isPal = true;
                while (i < j) {
                    if (palindrome.charAt(i) != palindrome.charAt(j)) {
                        isPal = false;
                        break;
                    };
                    i++;
                    j--;
                };
                if (isPal && Integer.valueOf(palindrome) > ans) {
                    ans = Integer.valueOf(palindrome);
                };
            };
        };
        System.out.println(ans);
    }
}