import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CountListElements {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList();
        for(int i = 0; i < 5; i++){
            list.add(1);
        }
        System.out.println(list.size());
        System.out.println(countElements(list));
    }

    public static int countElements (List list){
        int count = 0;
        if (list.isEmpty()) return count;
        list.remove(0);
        return ++count + countElements(list);
    }
}
