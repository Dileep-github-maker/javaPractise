import java.util.PriorityQueue;

public class eight {
    public static void main(String[] args) {
        PriorityQueue <Integer> obj =new PriorityQueue<>();
        obj.add(1);
        System.out.println(obj);
        System.out.println(obj.peek());
        obj.remove(1);
        System.out.println(obj);
    }
}
