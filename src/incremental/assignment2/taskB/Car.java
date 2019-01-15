package incremental.assignment2.taskB;

public class Car {
    private String name;
    private String color;
    Car(){
        this("honda","white");
        System.out.println("in first constructor");
    }
    Car(String name,String color){
        this.name = name;
        this.color = color;
        System.out.println("in second constructor");
    }
}
