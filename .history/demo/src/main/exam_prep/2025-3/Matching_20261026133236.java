import java.util.*;

public class Matching {
    public static void main(String[] args) {
        Map<String, String> hashmap1 = new HashMap<>();
        Map<String, String> hashmap2 = new HashMap<>();

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

        System.out.println(countMatchingKeyValuePairs(hashmap1, hashmap2));
    }

    public static int countMatchingKeyValuePairs(Map<String, String> hashmap1, Map<String, String> hashmap2) {
        int matchingPairs = 0;
        for (String key : hashmap1.keySet()) {
            if (hashmap2.containsKey(key) != null && (hashmap2.get(key)).equals(hashmap1.get(key))) {
                matchingPairs++;
            }
        }
        return matchingPairs;
    }
}
