import java.util.LinkedList;
import java.util.List;

class Student{
    int rno;
    String name,addr;
    Student(String name, int rno, String addr){
        this.name = name;
        this.rno = rno;
        this.addr = addr;
    }
}


public class ColLinkedList {
    public static void main(String[] args) {
        List<Student > lit = new LinkedList<>();
        Student std = new Student("Pramod",23,"Bangaluru");
        Student std1 = new Student("Raman",43,"Mumbai");
        lit.add(std);
        lit.add(std1);
        for(Student s:lit){
            System.out.println(s.name+" "+s.rno +" "+s.addr);
        }

    }
}
