package controlflow;

import java.util.HashSet;

public class ShareDigit {

    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(12, 23));
        //System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(12, 43));
    }

    public static boolean hasSharedDigit(int start, int end) {

        int lastDigitEnd = 0;
        int lastDigitStart = 0;
        int resetStart = 0;
        if (start < 10 | end <= 10 | end > 99) {
            return false;
        }

        while (end > 0) {
            lastDigitEnd = end % 10;
            resetStart = start;
            while (resetStart > 0) {
                lastDigitStart = resetStart % 10;
                if (lastDigitStart == lastDigitEnd) {
                    return true;
                }

                resetStart /= 10;
            }
            end /= 10;
        }
        return false;
    }
}


