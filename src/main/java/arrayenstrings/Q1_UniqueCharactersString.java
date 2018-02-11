package arrayenstrings;

import java.util.HashSet;
import java.util.Set;

class Q1_UniqueCharactersString {

    //implement an algorithm to determine if a string has all unique characters.
    // What if you cannot use additional data structure?

    boolean determineUniqueCharNoDS(final String string){
        int resultLength = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string.length(); j++) {
                char c1 = string.charAt(i);
                char c2 = string.charAt(j);
                if (c1 == c2){
                    //add the letter if you find it in the string.
                    resultLength ++;
                }
            }
        }
        //if the letter exists once in the string, then the result should be the same as the string length
        return resultLength == string.length();
    }

    boolean determineUniqueCharWithDS(final String string){
        Set<String> setStrings = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
             setStrings.add(string.substring(i,i+1));
        }
        // return true if the size of the Set list equal to the provided string.
        // The Set string size will be without any duplicates.
        //which means every letter in the string will be uniqe. If its not, the return false
        return setStrings.size() == string.length();
    }
}
