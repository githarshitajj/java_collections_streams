package java_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    //this is the custom reverse method
    public static <T> void reverseList(List<T> list) {
        //the T in the syntax is for representing that we are using generics
        //using T for all the inbuilt classes of type List
        int start =0;
        int end = list.size()-1; //the ending index

        while(start < end) {
            //swapping elements from the corners of the list
            T temp = list.get(start);
            list.set(start, list.get(end)); //assignment within the list
            list.set(end, temp);

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        reverseList(arrayList);
        System.out.println(arrayList);

        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        reverseList(linkedList);
        System.out.println(linkedList);

    }
}
