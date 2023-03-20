public class StringUtils {
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s1.length() != s2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i) - 'a']++;
            charCount[s2.charAt(i) - 'a']--;
        }
        for(int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(stringUtils.isAnagram(s1, s2));

        s1 = "triangle";
        s2 = "integral";
        System.out.println(stringUtils.isAnagram(s1, s2));

        s1 = "hello";
        s2 = "world";
        System.out.println(stringUtils.isAnagram(s1, s2));
    }
}
