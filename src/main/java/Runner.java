import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //task 1
        UniqueWordCounter counter = new UniqueWordCounter();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "hello", "cat", "dog", "capacity",
                "downloading", "cat", "turtle", "eagle", "swear",
                "sewer", "rat", "capacity", "war", "limit", "hello", "dog", "war"));

        counter.count(words);
        // разделение вывода задач в консоль
        System.out.println();
        // task 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Semenov", "+78005553535");
        phoneBook.add("Semenov", "+79990030405");
        phoneBook.add("Petrov", "+79992874546");
        phoneBook.add("Alekseyev", "+79987874541");
        System.out.println(phoneBook.get("Semenov"));
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Alekseyev"));
    }
}
