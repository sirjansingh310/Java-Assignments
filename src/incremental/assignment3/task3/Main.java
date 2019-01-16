package incremental.assignment3.task3;

public class Main {
    public static void mainMethodOne(InterfaceOne interfaceOne){
        interfaceOne.interfaceOneMethodOne();
        interfaceOne.interfaceOneMethodTwo();
    }
    public static void mainMethodTwo(InterfaceTwo interfaceTwo){
        interfaceTwo.interfaceTwoMethodOne();
        interfaceTwo.interfaceTwoMethodTwo();
    }
    public static void mainMethodThree(InterfaceThree interfaceThree){
        interfaceThree.interfaceThreeMethodOne();
        interfaceThree.interfaceThreeMethodTwo();
    }
    public static void mainMethodFour(InterfaceFour interfaceFour){
        interfaceFour.interfaceFourMethodOne();
        interfaceFour.interfaceOneMethodOne();
        interfaceFour.interfaceOneMethodTwo();
        interfaceFour.interfaceThreeMethodOne();
        interfaceFour.interfaceThreeMethodTwo();
        interfaceFour.interfaceTwoMethodOne();
        interfaceFour.interfaceTwoMethodTwo();
    }
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        mainMethodOne(derivedClass);
        mainMethodTwo(derivedClass);
        mainMethodThree(derivedClass);
        mainMethodFour(derivedClass);
    }
}
