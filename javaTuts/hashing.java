import java.util.HashSet;
import java.util.Iterator;
public class hashing {
    public static void main(String[] args) {
        //creation
        HashSet<Integer>set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        //search
        if(set.contains(3)){
            System.out.println("true");
        }

        Iterator it=set.iterator();

        while(it.hasNext()==true){
            System.out.println(it.next());
        }
    }
}
