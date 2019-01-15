package incremental.assignment2.taskCandD;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        String names[] = new String[]{"abc","def","xyz"};
        // for task D
        for(int i=0;i<names.length;i++){
           students[i] = new Student(names[i]);
        }
    }
}
