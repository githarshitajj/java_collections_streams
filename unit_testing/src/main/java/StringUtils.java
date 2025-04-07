public class StringUtils {
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        //String str = "";
        //gonna iterate the string from start and save it in the char from end
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            chars[j] = str.charAt(i);
            j--;
        }
        return new String(chars);
    }
    public boolean isPalindrome(String str) {
        String rev = reverse(str);
        return rev.equals(str);
    }

}
