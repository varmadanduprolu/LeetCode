package com.varma.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        //System.out.println(isomorphicStrings1("paper", "title"));
        //System.out.println(isomorphicStrings1("foo", "bar"));
        System.out.println(isomorphicStrings("eggA", "addG"));
    }
    public static boolean isomorphicStrings1(String s, String t) {
//        if(s.length()!=t.length()) return  false;
//        Map<Character,Character> map= new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            if(map.containsKey(s.charAt(i))){
//                char ch=map.get(s.charAt(i));
//                if(t.charAt(i)!=ch) return false;
//            }  else
//            map.put(s.charAt(i), t.charAt(i));
//        }
//        return true;

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (map.containsKey(charS)) {
                if (map.get(charS) != charT) {
                    return false;
                }
            } else {
                if (reverseMap.containsKey(charT)) {
                    return false;
                }
                map.put(charS, charT);
                reverseMap.put(charT, charS);
            }
        }
        return true;
    }

    public static boolean isomorphicStrings(String s, String t) {

        if(s.length() != t.length())
            return false;

        int [] tempS = new int[127];
        int [] tempT = new int[127];
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if(tempS[charS] != tempT[charT])
                return false;

            tempS[charS] = i + 1;
            tempT[charT] = i + 1;
        }
        return true;
//        if (s.length() != t.length()) return false;
//        Map<Character, Integer> mp1 = new HashMap<>();
//        Map<Character, Integer> mp2 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            //first string
//            if (mp1.containsKey(s.charAt(i))) {
//                mp1.put(s.charAt(i), mp1.get(s.charAt(i)) + 1);
//            } else {
//                mp1.put(s.charAt(i), 1);
//            }
//            //second string
//            if (mp2.containsKey(t.charAt(i))) {
//                mp2.put(t.charAt(i), mp2.get(t.charAt(i)) + 1);
//            } else {
//                mp2.put(t.charAt(i), 1);
//            }
//        }
//        if (mp1.size() != mp2.size()) return false;
//        for (int i = 0; i < s.length(); i++) {
//            if (mp1.get(s.charAt(i)) != mp2.get(t.charAt(i))) return false;
//        }
//        return true;

    }
}
