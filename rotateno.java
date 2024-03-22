public class rotateno {

    public static void rotate(int num) {
        int digits = countDigits(num);

        for (int i = 0; i < digits; i++) {
            int lastDigit = num % 10;
            num = (num / 10) + (lastDigit * (int)Math.pow(10, digits - 1));
            System.out.println(num);
        }
    }

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        rotate(1234);
    }
}
