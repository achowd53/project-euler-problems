public class solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            sum += i;
        sum *= sum;
        for (int i = 1; i <= 100; i++)
            sum -= i * i;
        System.out.println(sum);
    }
}
