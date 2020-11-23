public class Anagram {
    public static void main(String[] args) {
        boolean ok = isAnagram("green", "fox");
        System.out.println(ok);

    }

    public static boolean isAnagram(String word1, String word2) {
        for (int i = 0; i < word1.length(); i = i + 1) {
            char c = word1.charAt(i);
            if (word2.indexOf(c) == -1){
                return false;
            }
        }

        // charAt
        // s.indefOf
        return true;
    }

}
