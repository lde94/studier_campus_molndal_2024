package se.dsve;

public class Classroom {
    Student students[];

    public void addStudent(Student student) {
        students[students.length - 1] = student;
        /*students.length*/
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void removeStudent(Student student, String name) {
        for (int i = 0; i < students.length; i++) {
            if(student.name.equals(name)) {
                students[i] = null;
            }
        }

    }
}
