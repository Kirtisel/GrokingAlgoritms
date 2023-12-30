import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CountListElements {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList();
        for(int i = 0; i < 1000; i++){
            list.add(1);
        }
        System.out.println(list.size());
        System.out.println(countElements(list));
    }

    public static int countElements (List list){
        if (list.isEmpty()) return 0;
        list.remove(0);
        return 1 + countElements(list);
    }
}
