import java.util.Arrays;
import java.util.HashSet;

public class five {
    public static void main(String[] args) {
        
        HashSet <Integer> obj=new HashSet<>();
        obj.add(1);
        System.out.println(obj);
        obj.addAll(Arrays.asList(1,2,3,3,2,1));
        System.out.println(obj);
        

    }
}
