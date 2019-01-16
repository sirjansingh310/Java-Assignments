package incremental.assignment3.task1;

public class Hamster extends Rodent{
    Hamster() {
        System.out.println("In derived class hamster");
    }

    @Override
    public String getType() {
        return "Hamster";
    }

    @Override
    public void makeSound() {
        System.out.println("Hamster making sound!");
    }
}
