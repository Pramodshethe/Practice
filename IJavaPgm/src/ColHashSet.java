import java.util.HashSet;
import java.util.Iterator;

public class ColHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Pramod");
        hashSet.add("Pramod");
        hashSet.add("Brooo");
        hashSet.add("OM");
        Iterator itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
 }
}