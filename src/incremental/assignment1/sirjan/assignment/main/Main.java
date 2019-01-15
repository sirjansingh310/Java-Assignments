package incremental.assignment1.sirjan.assignment.main;

import incremental.assignment1.sirjan.assignment.data.Student;
import incremental.assignment1.sirjan.assignment.singleton.User;

public class Main {
    public static void main(String[] args) {
        // Task A
        Student student = new Student();
        student.printStudentDetails();
        student.printLocalStudentDetails();

        // Task B
        User user = User.createUser("abcd");
        user.printUserDetails();

    }

}
