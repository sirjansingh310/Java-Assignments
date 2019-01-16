package incremental.assignment3.task1;

public abstract class Rodent {
    Rodent(){
        System.out.println("In base class rodent");
    }
    public String getType(){
        return "Rodent";
    }
    public abstract void makeSound();

}
