import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s){
        students.add(s);
    }

    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        for(Student s : students){
            System.out.println(s);
        }
    }

    public void searchStudent(int id){
        for(Student s : students){
            if(s.getId()==id){
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int id){
        for(Student s : students){
            if(s.getId()==id){
                students.remove(s);
                System.out.println("Student deleted.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
