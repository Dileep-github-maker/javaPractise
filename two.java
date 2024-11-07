import java.util.*;

public class two {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        int a=obj.size();
        
        try{obj.add(1,2);
        System.out.println(obj);
        }
        catch(IndexOutOfBoundsException e){System.out.println(obj);}
        obj.add(1);
        obj.add(2);
        obj.forEach((n) -> {System.out.println(n);});

    }
}
