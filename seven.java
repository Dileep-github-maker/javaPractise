import java.util.Arrays;
import java.util.TreeSet;

public class seven {
    public static void main(String[] args) {
      TreeSet <Integer> obj=new TreeSet<>();
      obj.addAll(Arrays.asList(1,2,3,4,6,7));
      System.out.println(obj);
      System.out.println(obj.descendingSet());  
    }
}
