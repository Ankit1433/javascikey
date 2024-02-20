import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class assign5_10 {

    static void separateList(String[] words) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (!anagramGroups.containsKey(sortedWord)) {
                anagramGroups.put(sortedWord, new ArrayList<>());
            }
            anagramGroups.get(sortedWord).add(word);
        }

        for (List<String> group : anagramGroups.values()) {
            if (group.size() > 1) {
                System.out.println("Anagrams: " + group);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"tar", "rat", "meat", "listen", "silent", "ankita", "ankit", "tikna","art"};
        separateList(words);
    }
}