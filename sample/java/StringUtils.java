package com.example.app;

/**
 * String utility methods
 */
public class StringUtils {
    
    public static String format(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public static boolean isValidLength(String input) {
        return input != null && input.length() >= 8;
    }
}
