package incremental.assignment3.task1;

public class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("In derived class gerbil");
    }

    @Override
    public String getType() {
        return "Gerbil";
    }

    @Override
    public void makeSound() {
        System.out.println("Gerbil making sound!!");
    }
}
