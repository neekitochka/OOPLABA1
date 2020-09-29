package com.company;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++){
            String s = args[i];
        }
        String str1 = "nikita";
        String str2 = reverseString(str1);
        System.out.print(isPalindrome(str1,str2));
    }

    public static String reverseString(String str){
        String r = "";
        for (int i = 0; i < str.length(); i++){
            r = str.charAt(i) + r;
        }
        return r;
    }

    public static boolean isPalindrome(String s, String str){
        return s.equals(str);
    }
}
