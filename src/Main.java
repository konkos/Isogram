import java.util.HashSet;

public class Main {

    public static boolean isIsogram(String word) {
        HashSet<Character> hashSet = new HashSet<>();

        word = word.toUpperCase().trim();

        if (word.equals(""))
            return false;

        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);

            if (hashSet.contains(currentLetter))
                return false;

            hashSet.add(currentLetter);
        }

        return true;
    }
}
