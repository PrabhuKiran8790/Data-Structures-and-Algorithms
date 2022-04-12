/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Input: s = "anagram", t = "nagaram"
Output: true
 */


import java.util.HashMap;

public class ValidAnagram {
    static boolean isValidAnagram(String s, String t) {
        int s_length = s.length();
        int t_length = t.length();
        if (s_length != t_length) return false;

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i < s_length; i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i),0) +1 );
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }
        return mapT.equals(mapS);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isValidAnagram(s, t));   // true
    }
}
