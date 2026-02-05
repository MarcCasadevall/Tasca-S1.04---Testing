package ex2;

public class CalculateDni {
    public static void main(String[] args) {

        System.out.println(calculateWord(46952805));

    }


    public static String calculateWord(int number) {
        if (number < 0 || number > 99_999_999) {
            throw new IllegalArgumentException("Invalid DNI number");
        }

        String[] dniWord = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
                "Q", "V", "H", "L", "C", "K", "E"};
        int restLetter = number % 23;

        return dniWord[restLetter];
    }

}
