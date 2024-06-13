import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers(14, 16);

        checkSum(5, 12);

        checkNumberPositiveness(-1);

        isNumberNegative(-5);

        printNTimes("Hello world", 4);

        isYearLeap(2000);

        exchangeNumber();

        increaseNumber();

        multiplyArrayNumbers();

        fulfillArrays();

        createArray(4, 16);
    }
    public static void printThreeWords() {
        String[] words = {"Orange", "Banana", "Apple"};
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void checkSumSign() {
        int a = 8;
        int b = 12;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 1984;
        String color;
        if (value <= 0) {
            color = "Красный";
        } else if (value > 0 && value <= 100) {
            color = "Жёлтый";
        } else {
            color = "Зелёный";
        }
        System.out.println(color);
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static boolean checkSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void checkNumberPositiveness(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static boolean isNumberNegative(int number) {
        if (number < 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void printNTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
    public static boolean isYearLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(true);
                    return true;
                } else {
                    System.out.println(false);
                    return false;
                }
            } else {
                System.out.println(true);
                return true;
            }
        } else {
            System.out.println(false);
            return false;
        }
    }
    public static void exchangeNumber() {
        int[] numbers = {0, 1, 1, 1, 0, 0, 1, 0};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void increaseNumber() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void multiplyArrayNumbers() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void fulfillArrays() {
        int n = 10;
        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
                array[i][i] = 1;
                array[i][n - i - 1] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
