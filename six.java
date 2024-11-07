import java.util.Arrays;
import java.util.LinkedHashSet;

public class six {
    public static void main(String[] args) {
        LinkedHashSet <Integer> obj=new LinkedHashSet<>();
        obj.addAll(Arrays.asList(1,2,3,4));
        System.out.println(obj);
        System.out.println(obj.size());
    }
}
