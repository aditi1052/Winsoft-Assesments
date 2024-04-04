//Q-3: Write a Java Program to count the number of words in a string using HashMap.
import java.util.*;

public class Que_3 {
    
    public static void main(String[] args){
 
         Scanner sc = new Scanner(System.in);
         String str = sc.nextLine(); 
 
        Map<String, Integer> hashMap = new HashMap<>();
 
        String[] words = str.split(" ");
 
        for (String word : words) {
            if (hashMap.containsKey(word))
                hashMap.put(word, hashMap.get(word) + 1);
 
            else
                hashMap.put(word, 1);
        }
 
        System.out.println(hashMap);
    }
}
