package com.company.pr18;

public class Palindrome {
    public static String palindrome(String s) {
        if (s.length() == 1) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return palindrome(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Результат: " + palindrome("anna"));
    }
}
