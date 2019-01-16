package incremental.assignment3.task1;

public class Mouse extends Rodent {
    Mouse() {
        System.out.println("In derived class mouse");
    }

    @Override
    public String getType() {
        return "mouse";
    }

    @Override
    public void makeSound() {
        System.out.println("Mouse making sound!!");
    }
}
