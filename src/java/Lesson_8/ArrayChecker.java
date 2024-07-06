package Lesson_8;

import Lesson_8.Exceptions.MyArrayDataException;
import Lesson_8.Exceptions.MyArraySizeException;

public class ArrayChecker {
    private int sum = 0;

    public int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Ожидаемое количество строк массива: 4");
        }
        for (String[] strings : array) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Ожидаемое количество столбцов массива: 4");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException("Некорректные данные на позиции: [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }
}
