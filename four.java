import java.util.Arrays;
import java.util.Stack;

public class four {
    public static void main(String[] args) {
        Stack <Integer> obj=new Stack<>();
        obj.addAll(Arrays.asList(1,2,3,3,5));
        System.out.println(obj);
        obj.add(6);
        System.out.println(obj);
        int c=obj.elementAt(2);
        System.out.println(c);
        obj.elements();
        System.out.println(obj);
        obj.addFirst(1);
        System.out.println(obj);
        obj.notify();
        System.out.println(obj);
        
    }
}
