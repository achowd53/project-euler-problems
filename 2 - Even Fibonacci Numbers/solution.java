public class solution {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (b < 4000000) {
            int temp = a;
            a = b;
            b += temp;
            if (b%2 == 0) sum += b;
        };
        System.out.println(sum);
    }
}