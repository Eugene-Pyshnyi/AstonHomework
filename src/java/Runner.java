import Exceptions.MyArrayDataException;
import Exceptions.MyArraySizeException;

public class Runner {
    public static void main(String[] args) {
        ArrayChecker arrayChecker = new ArrayChecker();

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            arrayChecker.checkArraySize(correctArray);
        } catch (MyArraySizeException exception) {
            exception.printStackTrace();
        } catch (MyArrayDataException exception) {
            exception.printStackTrace();
        }
    }
}
