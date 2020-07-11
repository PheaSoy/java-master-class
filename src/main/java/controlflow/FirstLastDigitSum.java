package controlflow;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(267));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstDit = 0;
        int lastDigit = 0;
        int count = 0;
        if (number <= 9) lastDigit = number;
        while (number > 9) {
            if (count < 1) {
                lastDigit = number % 10;
                count++;
            }
            number /= 10;
        }
        ;
        firstDit = number;
        return firstDit + lastDigit;
    }

}