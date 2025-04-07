package java_regex.extraction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
        String text = "support@example.com hfifwfiuwh!!?? info@example.com";
        //String emailRE = "^[\\w-.]+@([\\w-]+.)+[\\w-]{2,4}$";
        String emailRE = "^[\\w.%+-]+@[\\w]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRE);
        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(matcher.group(1));
//        }
        //System.out.println(matcher.matches());
        System.out.println(pattern);
        System.out.println(matcher);
    }
}
