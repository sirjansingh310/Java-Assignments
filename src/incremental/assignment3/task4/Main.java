package incremental.assignment3.task4;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle = UnicycleFactory.createUnicycle();
        unicycle.ride();

        Bicycle bicycle = BicycleFactory.createBiCycle();
        bicycle.ride();

        Tricycle tricycle = TricycleFactory.createTricycle();
        tricycle.ride();
    }
}
