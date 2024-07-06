package Lesson_8;

import Lesson_8.Exceptions.MyArrayDataException;
import Lesson_8.Exceptions.MyArraySizeException;

public class Runner {
    public static void main(String[] args) {
        ArrayChecker arrayChecker = new ArrayChecker();

        String[][] array = {
                {"50", "34", "323", "41"},
                {"50", "16", "37", "28"},
                {"99", "10", "181", "123"},
                {"135", "14", "115", "100"}
        };
        try {
            int sum = arrayChecker.arraySum(array);
            System.out.println("Сумма элементов массива: " + sum);
            arrayChecker.arraySum(array);
        } catch (MyArraySizeException exception) {
            exception.printStackTrace();
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }
}
