import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] m = {};
        System.out.println(sum(m));
    }

    public static int sum (int [] m){
        if (m.length == 0) return 0;
        if (m.length == 1) return m[0];
        return m[0] + sum(Arrays.copyOfRange(m,1, m.length));

    }
}
