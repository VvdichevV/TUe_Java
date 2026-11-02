import java.util.*;

public class Matching {
    public static void main(String[] args) {
        HashMap<String, String> hashmap1 = new HashMap<>();
        HashMap<String, String> hashmap2 = new HashMap<>();

        hashmap1.put("Alice", "Healthy");
        hashmap1.put("Mary", "Ecstatic");
        hashmap1.put("Bob", "Happy");
        hashmap1.put("Chuck", "Fine");
        hashmap1.put("Felix", "Sick");

        hashmap2.put("Mary", "Ecstatic");
        hashmap2.put("Felix", "Healthy");
        hashmap2.put("Ricardo", "Superb");
        hashmap2.put("Tam", "Fine");
        hashmap2.put("Bob", "Happy");
    }

    public static int countMatchingKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
        int matchingPairs = 0;
        
        return matchingPairs;
    }
}
