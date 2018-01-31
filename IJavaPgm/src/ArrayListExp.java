import java.util.ArrayList;
import java.util.Iterator;

class ArrayListExp{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Pramod");
        al.add("Moto");
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Moto");
        al2.add("Samsung");
        al.retainAll(al2);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}