public class solution {
    public static void main(String[] args) {
        long x = Long.valueOf(600851475143L);
        long i = 2;
        while (i != x) {
            if (x%i == 0) {
                x /= i;
                i = 2;
            }
            else {
                i += 1;
            };
        };
        System.out.println(x);
    }
}