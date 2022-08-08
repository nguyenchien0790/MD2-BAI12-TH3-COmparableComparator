import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kiên", 30, "Thanh Hóa");
        Student student1 = new Student("Nam", 32, "Hà Tây");
        Student student2 = new Student("Quân", 25, "Ninh Bình");
        Student student3 = new Student("Hà", 37, "Hà Tĩnh");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st:
             lists) {
            System.out.println(st.toString());

        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi");
        for (Student st:
             lists) {
            System.out.println(st.toString());
        }
    }
}
