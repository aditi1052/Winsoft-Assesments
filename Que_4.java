//Q-4: Write a Java Program to find the duplicate characters in a string.
import java.util.*;

public class Que_4 {
    public static void main(String[] args) {
        printDuplicateChar("A");
        printDuplicateChar("penninsula");
        printDuplicateChar("aditia");
        
    }

    public static void printDuplicateChar(String str){
        if(str == null){
            System.out.println("Null String");
        }

        if(str.isEmpty()){
            System.out.println("An Empty String");
        }

        if(str.length() == 1){
            System.out.println("Single Character String");
            return;
        }

        char words[] = str.toCharArray();
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for(Character ch : words){
            if(charMap.containsKey(ch)){
                charMap.put(ch, charMap.get(ch) +1);
            }
            else{
                charMap.put(ch, 1);
            }
        }

        //printing the map
        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();

        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
