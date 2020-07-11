package controlflow;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }

    public static boolean isPalindrome(int number) {

        int givenNumber = number;
        int revers = 0;
        int lastDigit = 0;
        if (number < 0) {
            number = number * -1;
        }

        while (number > 0) {
            lastDigit = number % 10;
            revers = revers * 10;
            revers += lastDigit;
            number /= 10;
        }
        if (givenNumber <= 0) givenNumber = givenNumber * -1;
        if (revers == givenNumber) return true;
        else return false;
    }


}
