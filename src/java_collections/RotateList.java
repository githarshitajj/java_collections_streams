package java_collections;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
    private static void reverse(List<Integer> list, int start, int end) {
        while(start < end){
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    public static void rotateList(List<Integer> list, int rotateBy) {
        int n = list.size();
        rotateBy = rotateBy % n; //handle cases where rotate > n

        //reverse the entire list
        reverse(list, 0, n-1);

        //reverse the first 'rotateBy' elements
        reverse(list, 0, rotateBy-1);

        //reverse the remaining elements
        reverse(list, rotateBy, n-1);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int rotateBy = 2;
        rotateList(list, rotateBy);
        System.out.println(list);
    }
}
