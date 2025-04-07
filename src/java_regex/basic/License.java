package java_regex.basic;

import java.util.Scanner;
import java.util.regex.Pattern;

public class License {
    public static boolean validLicense(String license) {
        return Pattern.matches("^[A-Z]{2}[0-9]{4}$", license);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String license = sc.nextLine();
        System.out.println(validLicense(license));
    }
}
