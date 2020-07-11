package controlflow;

public class TernaryOperator {

    public static void main(String[] args) {
        char gender = 'T';
        String person = gender=='M'? "Male":"Female";
        System.out.println(person);
    }
}
