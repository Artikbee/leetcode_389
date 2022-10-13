package org.example;

public class Solution {
    public char findTheDifference(String s, String t) {
        String res = s + t;
        char[] chars = res.toCharArray();
        int fin = 0;
        for (int n : chars)
            fin =fin^n;
        return (char) fin;
    }
}
