package Lesson10;

public class Menegment {
    private static final Student[] STUDENTS = new Student[10];

    public static void main(String[] args) {
        
    }
    public static void getAllStudents() {

        for (Student student : STUDENTS)
            System.out.println(student);
    }
}




