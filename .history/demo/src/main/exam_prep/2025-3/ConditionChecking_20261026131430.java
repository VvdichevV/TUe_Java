import java.util.*;

public class ConditionChecking {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(List.of(2, 9, 7, 11, 8, 17));
        checkCondition(input);
    }

    public static boolean checkCondition(ArrayList<Integer> input) {
        for (int i = 1; i < input.size() - 1; i += 2) {
            if (!(input.get(i) > input.get(i - 1) && input.get(i) > input.get(i + 1))) {
                return false;
            }
        }
    }
}
