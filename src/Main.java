import java.util.HashMap;
import java.util.Map;

public class Main {
    protected static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
            "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim " +
            "ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
            "commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse " +
            "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non " +
            "proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isLetter(symbol)) {
                if (map.containsKey(symbol)) {
                    int times = map.get(symbol);
                    map.put(symbol, (times+1));
                } else {
                    map.put(symbol, 1);
                }
            }
        }
        int maxInt = -1;
        char maxChar=' ';
        int minInt = Integer.MAX_VALUE;
        char minChar=' ';
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > maxInt) {
                maxInt = kv.getValue();
                maxChar = kv.getKey();
            }
            if (kv.getValue() < minInt) {
                minInt = kv.getValue();
                minChar = kv.getKey();
            }
        }
        System.out.println("буква \"" + maxChar + "\" встречалась чаще всего");
        System.out.println("буква \"" + minChar + "\" встречалась реже всего");
    }
}
