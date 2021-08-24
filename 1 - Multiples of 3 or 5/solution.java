public class solution {
    public static void main(String[] args) {
        int sum = 0;
        int three = 3;
        int five = 5;
        while (three < 1000) {
            if (three % 5 != 0) sum += three;
            three += 3;
        }; 
        while (five < 1000) {
            sum += five;
            five += 5;
        }
        System.out.println(sum);
    }
}