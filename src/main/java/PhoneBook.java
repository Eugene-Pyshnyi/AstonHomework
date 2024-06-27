import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, ArrayList<String>> phoneMap;

    public PhoneBook() {
        this.phoneMap = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (phoneMap.containsKey(lastName)) {
            phoneMap.get(lastName).add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneMap.put(lastName, phoneNumbers);
        }
    }

    public ArrayList<String> get(String lastName) {
        return phoneMap.getOrDefault(lastName, new ArrayList<>());
    }
}
