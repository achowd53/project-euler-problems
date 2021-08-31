public class solution {
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    private static long lcm(long a, long b) {
        if (a % b == 0)
            return a;
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        long ans = 1;
        for (long i = 2; i <= 20; i++) {
            ans = lcm(ans, i);
        }
        ;
        System.out.println(ans);
    }
}