package java_regex.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Username {
    public static boolean validUsername(String username) {
        return Pattern.matches("^[A-Za-z]\\w{4,14}$", username);
    }
    public static void main(String[] args) {
        //alphanumeric, underscore, limit 5-15, starts with a letter
        //[A-Za-z]\w+{5,15}
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        boolean valid = validUsername(username);
        System.out.println(valid);
    }
}
