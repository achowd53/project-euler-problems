import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        boolean[] numbers = new boolean[114320]; // nth prime always less than n(ln(n)+ln(ln(n)))
        Arrays.fill(numbers, true);
        int primes_found = 0;
        for (int i = 2; i < 114320; i++) {
            if (numbers[i]) {
                primes_found += 1;
                if (primes_found == 10001) {
                    System.out.println(i);
                    break;
                }
                for (int multiple = 2 * i; multiple < 114320; multiple += i) {
                    numbers[multiple] = false;
                }
            }
        }
    }
}
