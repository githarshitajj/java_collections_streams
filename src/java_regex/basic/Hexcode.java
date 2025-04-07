package java_regex.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Hexcode {
    public static boolean validhexcode(String hexcode) {
        return Pattern.matches("^#[0-9a-fA-F]{6}$", hexcode);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hexcode = sc.nextLine();
        System.out.println(validhexcode(hexcode));
    }
}
