package incremental.assignment1.sirjan.assignment.data;
// First task
public class Student {
    private int rollNumber;
    private char section;

    public void printStudentDetails(){
        // works fine because all members are loaded into heap whenever the instance of a class is created. Default values are given when
        // they are loaded into the heap.
        System.out.println("Roll number " + rollNumber);
        System.out.println("Studies in section " + section);
    }
    public void printLocalStudentDetails(){
        int myRollNumber;
        int mySection;
        /*
        This throws error as local variables of function are loaded into the stack and no default values are given.
        System.out.println("Roll number " + myRollNumber);
        System.out.println("Studies in section " + mySection);
        */
    }

}
