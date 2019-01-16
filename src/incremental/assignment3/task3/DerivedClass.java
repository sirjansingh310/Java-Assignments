package incremental.assignment3.task3;

public class DerivedClass extends BaseClass implements InterfaceFour{
    DerivedClass() {
        System.out.println("In derived class");
    }

    @Override
    public void interfaceFourMethodOne() {
        System.out.println("Interface four method one ");
    }

    @Override
    public void interfaceOneMethodOne() {
        System.out.println("Interface one method one");
    }

    @Override
    public void interfaceOneMethodTwo() {
        System.out.println("Interface one method two");
    }

    @Override
    public void interfaceThreeMethodOne() {
        System.out.println("Interface three method one");
    }

    @Override
    public void interfaceThreeMethodTwo() {
        System.out.println("Interface three method two");
    }

    @Override
    public void interfaceTwoMethodOne() {
        System.out.println("Interface two method one");
    }

    @Override
    public void interfaceTwoMethodTwo() {
        System.out.println("Interface two method two");
    }
}
