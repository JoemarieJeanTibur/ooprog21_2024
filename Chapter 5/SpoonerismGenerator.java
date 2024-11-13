import java.util.Scanner;

public class SpoonerismGenerator {

    private static Scanner tibur = new Scanner (System.in);

    public static void main(String[] args) {
        
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

        //System.out.println("");

        String spoonerizedWord1 = spoonerize(word1, word2);
        String spoonerizedWord2 = spoonerize(word2, word1);

        if (spoonerizedWord1.equals(word1) && spoonerizedWord2.equals(word2)) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize. "); 
        } else {
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " and " + spoonerizedWord2);
        }

        tibur.close();
    }

    public static String getWord(String prompt) {
        System.out.print(prompt);
        return tibur.nextLine();
    }

    public static String spoonerize(String word1, String word2) {
        int vowelIndex1 = findVowelIndex(word1);
        int vowelIndex2 = findVowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1) {
            return word1; 
        }

        String prefix1 = word1.substring(0, vowelIndex1);
        String suffix1 = word1.substring(vowelIndex1);
        String prefix2 = word2.substring(0, vowelIndex2);
        String suffix2 = word2.substring(vowelIndex2);

        return prefix2 + suffix1;
    }

    public static int findVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));
            if ("aeiou".indexOf(c) != -1) {
                return i;
            }
        }
        return -1;
    }
}