import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static StudentRepository instance = null;
    private List<Student> students = new ArrayList<>();

    private StudentRepository(){
        Student student = new Student();
        student.id = '1';
        student.name = "John";
        student.password = "abc";
        this.students.add(student);

        student.id = '2';
        student.name = "Maria";
        student.password = "abc";
        this.students.add(student);

        student.id = '3';
        student.name = "Joel";
        student.password = "abc";
        this.students.add(student);

        student.id = '4';
        student.name = "Gabriel";
        student.password = "abc";
        this.students.add(student);

        student.id = '5';
        student.name = "Maxim";
        student.password = "abc";
        this.students.add(student);

        student.id = '6';
        student.name = "Selina";
        student.password = "abc";
        this.students.add(student);

        student.id = '7';
        student.name = "Liam";
        student.password = "abc";
        this.students.add(student);

        student.id = '8';
        student.name = "Fern";
        student.password = "abc";
        this.students.add(student);

        student.id = '9';
        student.name = "Lily";
        student.password = "abc";
        this.students.add(student);

        student.id = '9';
        student.name = "Harvey";
        student.password = "abc";
        this.students.add(student);

        public static StudentRepository getInstance {
            if (instance == null) {
                instance = new StudentRepository();
            }
            return instance;
        }

        public void addStudent(Student student) {
            this.students.add(student);
        }

        public List<Student> getStudents(){
            return this.students;
        }
    }


}
}



