import java.util.Arrays;
import java.util.LinkedList;

public class three {
    public static void main(String[] args) {
        LinkedList <Integer> obj=new LinkedList<>();
        obj.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(obj);
        obj.push(1);
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
        obj.poll();
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
    }
}
