import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> m=new ArrayList<>();

        //add elements
        m.add(0);
        m.add(13);
        m.add(15);
        //print elements
        System.out.println(m);

        int element = m.get(1);
        System.out.println(element);
    }

}
