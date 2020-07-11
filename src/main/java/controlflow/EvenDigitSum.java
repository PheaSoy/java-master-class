package controlflow;

public class EvenDigitSum {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number){
        int sum=0;
        if (number<0) return -1;
        while (number>0) {
            if(number%2==0){
                sum = sum+number%10;
            }
            number/=10;
        }
        return sum;
    }

}
