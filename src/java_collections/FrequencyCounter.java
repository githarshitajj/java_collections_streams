package java_collections;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequency = new HashMap<String, Integer>();

        for(String element : list) {
            //if already there then increment the counter of that word
            if(frequency.containsKey(element)) {
                frequency.put(element, frequency.get(element) + 1);
            }
            //else add the element with counter at 1
            else {
                frequency.put(element, 1);
            }
        }

        return frequency;
    }

    public static void main(String[] args) {
        List<String> inptList = Arrays.asList("apple", "banana", "orange" );

        Map<String, Integer> frequency = countFrequency(inptList);
        System.out.println(frequency);

    }
}
