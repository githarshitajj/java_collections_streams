import java.util.ArrayList;
import java.util.List;

public class ListManager {
    //List<Integer> list = new ArrayList<>();
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }
    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }
}
