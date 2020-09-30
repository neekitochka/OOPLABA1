package com.company;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            String s = args[i];
           System.out.print(s + " " + isPalindrome(s));
        };
    }

    public static String reverseString(String str){
        String r = "";
        for (int i = 0; i < str.length(); i++){
            r = str.charAt(i) + r;
        }
        return r;
    }

    public static boolean isPalindrome(String s){
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}
