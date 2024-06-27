import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        UniqueWordCounter counter = new UniqueWordCounter();
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hello", "world", "hello", "cat", "dog", "capacity",
                "downloading", "cat", "turtle", "eagle", "swear",
                "sewer", "rat", "capacity", "war", "limit", "hello", "dog", "war"));

        counter.count(words);
    }
}
